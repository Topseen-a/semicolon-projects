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
                System.out.println("Withdrawal Successful");
            }
            else {
                System.out.println("Invalid amount or Insufficient balance");
            }
        }
        else {
            System.out.println("Incorrect pin");
        }
    }

    public int checkBalance(int userPin) {
        if (userPin != pin) {
            System.out.println("Incorrect pin");
            return -1;
        }
        return balance;
    }
}
