package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAppTest {
    private BankApp bank;
    private Account account;
    private Account secondAccount;

    private String pin = "1234";
    private String secondPin = "5678";

    @BeforeEach
    public void setUp() {
        bank = new BankApp("Semicolon Bank");
    }

    @Test
    public void testThatBankHasName() {
        assertEquals("Semicolon Bank", bank.getName());
    }

    @Test
    public void testThatGetPhoneNumberReturnsCorrectPhoneNumber() {
        Account account = bank.createAccount("Tayo", "08149587217", "1234");
        assertEquals("08149587217", account.getPhoneNumber());
    }

    @Test
    public void testThatGetAccountNumberIs10Digits() {
        Account account = bank.createAccount("Tayo", "08149587217", "1234");
        assertEquals(10, account.getAccountNumber().length());
    }

    @Test
    public void testThatAccountListInBankIsEmpty() {
        assertEquals(0, bank.getAllAccounts().size());
    }

    @Test
    public void testThatAccountIsCreated() {
        assertEquals(0, bank.getAllAccounts().size());
        account = bank.createAccount("Tayo", "08149587217", pin);
        assertEquals(1, bank.getAllAccounts().size());
    }

    @Test
    public void testThatDepositThroughBankWorks() {
        assertEquals(0, bank.getAllAccounts().size());
        account = bank.createAccount("Tayo", "08149587217", pin);
        bank.deposit(account.getAccountNumber(), 5000);
        assertEquals(5000, bank.checkBalance(account.getAccountNumber(), pin));
    }

    @Test
    public void testThatWithdrawThroughBankWorks() {
        assertEquals(0, bank.getAllAccounts().size());
        account = bank.createAccount("Tayo", "08149587217", pin);
        bank.deposit(account.getAccountNumber(), 5000);
        bank.withdraw(account.getAccountNumber(), 2000, pin);

        assertEquals(3000, bank.checkBalance(account.getAccountNumber(), pin));
    }

    @Test
    public void testThatTransferThroughBankWorks() {
        assertEquals(0, bank.getAllAccounts().size());
        account = bank.createAccount("Tayo", "08149587217", pin);
        secondAccount = bank.createAccount("Bola", "08033297106", secondPin);
        bank.deposit(account.getAccountNumber(), 5000);

        bank.transfer(account.getAccountNumber(), secondAccount.getAccountNumber(), 2000, pin);

        assertEquals(3000, bank.checkBalance(account.getAccountNumber(), pin));
        assertEquals(2000, bank.checkBalance(secondAccount.getAccountNumber(), secondPin));
    }

    @Test
    public void testThatTransferWithWrongPinThrowsException() {
        assertEquals(0, bank.getAllAccounts().size());
        account = bank.createAccount("Tayo", "08149587217", pin);
        secondAccount = bank.createAccount("Bola", "08033297106", secondPin);
        bank.deposit(account.getAccountNumber(), 5000);

        assertThrows(IllegalArgumentException.class, () -> bank.transfer(account.getAccountNumber(), secondAccount.getAccountNumber(), 2000, "1223"));
    }

    @Test
    public void testThatFindingNonExistingAccountThrowsException() {
        assertEquals(0, bank.getAllAccounts().size());
        assertThrows(IllegalArgumentException.class, () -> bank.deposit("1234567", 1000));
    }

    @Test
    public void testThatInvalidPhoneNumberThrowsException() {
        assertEquals(0, bank.getAllAccounts().size());
        assertThrows(IllegalArgumentException.class, () -> bank.createAccount("Bola", "12345", "1234"));
    }
}
