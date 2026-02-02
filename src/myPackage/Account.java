package myPackage;

public class Account {
    private int balance;
    private int pin;

    public Account(int pin) {
        this.balance = 0;
        this.pin = pin;
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
}
