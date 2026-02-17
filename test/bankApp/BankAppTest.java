package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAppTest {
    BankApp bank;
    Account account;
    Account secondAccount;

    private int pin = 1234;
    private int secondPin = 5678;

    @BeforeEach
    public void setUp() {
        bank = new BankApp();

        account = new Account("Tayo", "08149587217", pin);
        secondAccount = new Account("Bola", "08033297106", secondPin);
    }

    @Test
    public void testThatAccountListInBankIsEmpty() {
        assertEquals(0, bank.getAllAccounts().size());
    }

    @Test
    public void testThatAccountCanBeAddedToBank() {
        assertEquals(0, bank.getAllAccounts().size());
        bank.addAccount(account);
        bank.addAccount(secondAccount);
        assertEquals(2, bank.getAllAccounts().size());
    }

    @Test
    public void testThatDepositWorksThroughBankApp() {
        assertEquals(0, bank.getAllAccounts().size());
        bank.addAccount(account);
        bank.deposit(account.getAccountNumber(), 5000);
        assertEquals(5000, bank.checkBalance(account.getAccountNumber(), pin));
    }

    @Test
    public void testThatWithdrawWorksThroughBankApp() {
        assertEquals(0, bank.getAllAccounts().size());
        bank.addAccount(account);
        bank.deposit(account.getAccountNumber(), 5000);
        bank.withdraw(account.getAccountNumber(), 2000, pin);
        assertEquals(3000, bank.checkBalance(account.getAccountNumber(), pin));
    }

    @Test
    public void testThatTransferWorksThroughBankApp() {
        assertEquals(0, bank.getAllAccounts().size());
        bank.addAccount(account);
        bank.addAccount(secondAccount);
        bank.deposit(account.getAccountNumber(), 5000);

        bank.transfer(account.getAccountNumber(), secondAccount.getAccountNumber(), 2000, pin);

        assertEquals(3000, bank.checkBalance(account.getAccountNumber(), pin));
        assertEquals(2000, bank.checkBalance(secondAccount.getAccountNumber(), secondPin));
    }

    @Test
    public void testThatFindingNonExistingAccountThrowsException() {
        assertEquals(0, bank.getAllAccounts().size());
        assertThrows(IllegalArgumentException.class, () -> bank.deposit("0000000000", 1000));
    }
}
