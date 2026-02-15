package bankApp;

public class Account {
    private String number;
    private int balance;
    private int pin;

    public Account(String number, int pin) {
        this.number = number;
        this.balance = 0;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return number;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount, int userPin) {
        if (userPin == pin) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

    public int checkBalance(int userPin) {
        if (userPin != pin) {
            return -1;
        }
        return balance;
    }

    public boolean transfer(Account targetAccount, int amount, int userPin) {
        if (userPin != pin) {
            return false;
        }

        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            targetAccount.deposit(amount);
            return true;
        }

        return false;
    }
}
