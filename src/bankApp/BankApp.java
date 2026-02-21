package bankApp;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
    private String name;
    private List<Account> accounts;

    public BankApp(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account createAccount(String name, String phoneNumber, String pin) {
        String accountNumber = generateAccountNumber(phoneNumber);
        if (findAccountIfExists(accountNumber) != null) {
            throw new IllegalArgumentException("Account already exists");
        }
        Account account = new Account(name, phoneNumber, pin);
        account.setAccountNumber(accountNumber);
        accounts.add(account);
        return account;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void transfer(String senderAccountNumber, String receiverAccountNumber, double amount, String pin) {
        Account sender = findAccount(senderAccountNumber);
        Account receiver = findAccount(receiverAccountNumber);
        sender.withdraw(amount, pin);
        receiver.deposit(amount);
    }

    public double checkBalance(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public String getName() {
        return name;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    private Account findAccountIfExists(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    private String generateAccountNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.matches("\\d{11}"))
            throw new IllegalArgumentException("Phone number must be 11 digits");

        return phoneNumber.substring(1);
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new IllegalArgumentException("Account not found");
    }
}
