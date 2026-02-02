package myPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;
    private int pin = 1234;

    @BeforeEach
    public void setUp() {
        account = new Account(pin);
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
    public void testThatWhenDepositIsNegative2kThenBalanceIsUnchanged() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(-2_000);
        assertEquals(0, account.checkBalance(pin));
    }

    @Test
    public void testThatWhenDepositIs5kAndWithdrawNegative2k_balanceRemainsUnchanged() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.withdraw(-2000, pin);
        assertEquals(5_000, account.checkBalance(pin));
    }

    @Test
    public void testThatWhenWithdrawIs10kAtInitialBalance_balanceIsUnchanged() {
        assertEquals(0, account.checkBalance(pin));
        account.withdraw(10_000, pin);
        assertEquals(0, account.checkBalance(pin));
    }

    @Test
    public void testThatWhenDepositIs5kWithdraw2kThenBalanceIs3k() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.withdraw(2_000, pin);
        assertEquals(3_000, account.checkBalance(pin));
    }

    @Test
    public void testThatWhenDepositIs5kThenWithdrawMoreThanBalance_balanceRemainsUnchanged() {
        assertEquals(0, account.checkBalance(pin));
        account.deposit(5_000);
        account.withdraw(10_000, pin);
        assertEquals(5_000, account.checkBalance(pin));
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
}