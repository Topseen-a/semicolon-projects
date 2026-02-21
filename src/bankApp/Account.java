package bankApp;

public class Account {
    private String name;
    private String accountNumber;
    private String phoneNumber;
    private String pin;
    private double balance;

    public Account(String name, String phoneNumber, String pin) {
        validateName(name);
        this.name = name;
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
        validatePin(pin);
        this.pin = pin;
        this.balance = 0;

    }

    public void setAccountNumber(String accountNumber) {
        validateAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
    }

    public double checkBalance(String userPin) {
        validateUserPin(userPin);
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount, String userPin) {
        validateUserPin(userPin);
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public void changePin(String oldPin, String newPin) {
        validateUserPin(oldPin);
        validatePin(newPin);
        this.pin = newPin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void validateName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void validateAccountNumber(String accountNumber) {
        if (accountNumber == null || !accountNumber.matches("\\d{10}"))
            throw new IllegalArgumentException("Account number must be 10 digits");
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    private void validatePin(String pin) {
        if (pin == null || pin.length() != 4) {
            throw new IllegalArgumentException(("PIN must be a four digit pin"));
        }
    }

    private void validateUserPin(String userPin) {
        if (!pin.equals(userPin)) {
            throw new IllegalArgumentException("Invalid PIN");
        }
    }
}
