package bankApp;

public class Account {
    private String name;
    private String number;
    private String phoneNumber;
    private int balance;
    private int pin;

    public Account(String name, String phoneNumber, int pin) {
        validateName(name);
        validatePhoneNumber(phoneNumber);
        validatePinCount(pin);
        this.name = name;
        this.number = phoneNumber.substring(1);
        this.phoneNumber = phoneNumber;
        this.balance = 0;
        this.pin = pin;
    }

    public int checkBalance(int userPin) {
        validatePin(userPin);
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void withdraw(int amount, int userPin) {
        validatePin(userPin);
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public void transfer(Account receiverAccount, int amount, int userPin) {
        validatePin(userPin);
        if (receiverAccount == null) {
            throw new IllegalArgumentException("Receiver account cannot be null");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        this.balance -= amount;
        receiverAccount.deposit(amount);
    }

    public String getAccountNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() < 11) {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    private void validatePinCount(int pin) {
        if (pin < 1000 || pin > 9999) {
            throw new IllegalArgumentException(("PIN must be a four digit pin"));
        }
    }

    private void validatePin(int userPin) {
        if (userPin != pin) {
            throw new IllegalArgumentException("Invalid PIN");
        }
    }
}
