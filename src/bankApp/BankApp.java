package bankApp;

import java.util.ArrayList;
import java.util.List;

public class BankApp {

    private List<Account> accounts;

    public BankApp() {

        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }

        for (Account accountList : accounts) {
            if (accountList.getAccountNumber().equals(account.getAccountNumber())) {
                throw new IllegalArgumentException("Account already exists");
            }
        }
        accounts.add(account);
    }

    public void deposit(String accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, int amount, int pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, int pin) {
        Account sender = findAccount(senderAccountNumber);
        Account receiver = findAccount(receiverAccountNumber);
        sender.transfer(receiver, amount, pin);
    }

    public int checkBalance(String accountNumber, int pin) {
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    private Account findAccount(String accountNumber) {
        for (Account accountList : accounts) {
            if (accountList.getAccountNumber().equals(accountNumber)) {
                return accountList;
            }
        }
        throw new IllegalArgumentException("No account found with number");
    }
}
