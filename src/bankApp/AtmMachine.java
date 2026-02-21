package bankApp;

import java.util.Scanner;

public class AtmMachine {
    private static BankApp bankApp;

    static void main() {
        bankApp = new BankApp("X bank");
        displayMainMenu();
    }

    public static void displayMainMenu() {
        String mainMenu = """
                Welcome to Semicolon bank!!!
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Exit
                """;

        char response = input(mainMenu).charAt(0);
        switch (response) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            default -> exit();
        }
    }

    private static void checkBalance() {
        String accountNumber = input("Enter your account number");
        String pin = input("Enter your pin");
        try {
            double balance = bankApp.checkBalance(accountNumber, pin);
            print("New balance is " + balance);
        }
        catch (Exception exception) {
            print(exception.getMessage());
        }
        finally {
            displayMainMenu();
        }
    }

    private static void transfer() {
        String senderAccountNumber = input("Enter your account number");
        String receiverAccountNumber = input("Enter receiver account number");
        double amount = Double.parseDouble(input("Enter amount"));
        String pin = input("Enter your pin");
        try {
            bankApp.transfer(senderAccountNumber, receiverAccountNumber, amount, pin);
            print("Transfer successful");
            double balance = bankApp.checkBalance(senderAccountNumber, pin);
            print("New balance is " + balance);
        }
        catch (Exception exception) {
            print(exception.getMessage());
        }
        finally {
            displayMainMenu();
        }
    }

    private static void withdraw() {
        String accountNumber = input("Enter your account number");
        double amount = Double.parseDouble(input("Enter amount"));
        String pin = input("Enter your pin");
        try {
            bankApp.withdraw(accountNumber, amount, pin);
            print("Withdraw successful");
            double balance = bankApp.checkBalance(accountNumber, pin);
            print("New balance is " + balance);
        }
        catch (Exception exception) {
            print(exception.getMessage());
        }
        finally {
            displayMainMenu();
        }
    }

    private static void deposit() {
        String accountNumber = input("Enter your account number");
        double amount = Double.parseDouble(input("Enter amount"));
        try {
            bankApp.deposit(accountNumber, amount);
            print("Deposit successful");
        }
        catch (Exception exception) {
            print(exception.getMessage());
        }
        finally {
            displayMainMenu();
        }
    }

    private static void createAccount() {
        String name = input("Enter your name");
        String phoneNumber = input("Enter your phone number");
        String pin = input("Enter a 4 digit pin");
        try {
            bankApp.createAccount(name, phoneNumber, pin);
            print("Account created successfully");
        }
        catch (Exception exception) {
            print(exception.getMessage());
        }
        finally {
            displayMainMenu();
        }
    }

    private static void exit() {
        print("Exiting...");
        System.exit(0);
    }

    private static String input(String message) {
        Scanner input = new Scanner(System.in);
        print(message);
        return input.nextLine();
    }

    private static void print(String mainMenu) {
        System.out.println(mainMenu);
    }
}
