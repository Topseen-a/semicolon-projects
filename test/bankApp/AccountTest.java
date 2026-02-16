package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;
    Account secondAccount;
    private int pin = 1234;
    private int secondPin = 5678;

    @BeforeEach
    public void setUp() {
        account = new Account("Tayo","08149587217", pin);
        secondAccount = new Account("Bola","08033297106", secondPin);
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
        assertThrows(IllegalArgumentException.class, () -> account.checkBalance(8122));
    }

    @Test
    public void testThatTransferReducesSenderBalanceAndIncreasesReceiverBalance() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.transfer(secondAccount, 2_000, pin);

        assertEquals(3_000, account.checkBalance(pin));
        assertEquals(2_000, secondAccount.checkBalance(secondPin));
    }

    @Test
    public void testThatTransferWithWrongPinThrowsException() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        assertThrows(IllegalArgumentException.class, () -> account.transfer(secondAccount, 2_000, 8122));

        assertEquals(5_000, account.checkBalance(pin));
        assertEquals(0, secondAccount.checkBalance(secondPin));
    }

    @Test
    public void testThatTransferMoreThanBalanceThrowsException() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(1_000);
        assertThrows(IllegalArgumentException.class, () -> account.transfer(secondAccount, 5_000, pin));

        assertEquals(1_000, account.checkBalance(pin));
        assertEquals(0, secondAccount.checkBalance(secondPin));
    }

    @Test
    public void testGetAccountNumber() {
        assertEquals("8149587217", account.getAccountNumber());
        assertEquals("8033297106", secondAccount.getAccountNumber());
    }
}