package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;
    private String pin = "1234";

    @BeforeEach
    public void setUp() {
        account = new Account("Tayo","8149587217", "08149587217", pin);
    }

    @Test
    public void testThatAccountBalanceAtInitialIs0k() {
        assertEquals(0, account.checkBalance(pin));
    }

    @Test
    public void testThatWhenDepositIs5kThenBalanceIs5k() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance(pin));
    }

    @Test
    public void testThatWhenDepositIsNegative2kThrowsException() {
        assertEquals(0, account.checkBalance(pin));

        assertThrows(IllegalArgumentException.class, () -> account.deposit(-2_000));
    }

    @Test
    public void testThatWhenDepositIs5kAndWithdrawIs2k_balanceIs3k() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.withdraw(2000, pin);
        assertEquals(3_000, account.checkBalance(pin));
    }

    @Test
    public void testThatDepositIs5kAndWithdrawNegativeThrowsException() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-2_000, pin));
    }

    @Test
    public void testThatWhenWithdrawIs10kAtInitialBalanceThrowsException() {
        assertEquals(0, account.checkBalance(pin));

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(10_000, pin));
    }

    @Test
    public void testThatWhenDepositIs5kThenWithdrawMoreThanBalanceThrowsException() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(10_000, pin));
    }

    @Test
    public void testThatDepositTwiceReturnsNewBalance() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.deposit(2_000);
        assertEquals(7_000, account.checkBalance(pin));
    }

    @Test
    public void testThatBalanceIs5kThenWithdrawTwiceReturnsRemainingBalance() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.withdraw(2_000, pin);
        account.withdraw(2_000, pin);
        assertEquals(1_000, account.checkBalance(pin));
    }

    @Test
    public void testThatBalanceIs5kThenWithdraw5k() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.withdraw(5_000, pin);
        assertEquals(0, account.checkBalance(pin));
    }

    @Test
    public void testThatCheckBalanceWithWrongPinThrowsException() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        assertThrows(IllegalArgumentException.class, () -> account.checkBalance("8122"));
    }

    @Test
    public void testThatChangePinWorksSuccessfully() {
        assertEquals(0, account.checkBalance(pin));
        account.changePin("1234", "4321");
        account.deposit(1000);
        assertEquals(1000, account.checkBalance("4321"));
    }

    @Test
    public void testThatChangePinWithWrongOldPinThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> account.changePin("1223", "4321"));
    }

    @Test
    public void testThatGetAccountNumberIs10Digits() {
        assertEquals("8149587217", account.getAccountNumber());
        assertEquals(10, account.getAccountNumber().length());
    }
}