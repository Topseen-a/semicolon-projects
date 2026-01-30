package myPackage;

import java.util.Scanner;
import java.time.LocalDate;

public class MultiFuelDispenserSystem{

    static String[] fuelNames = {"Petrol", "Diesel", "Kerosene", "Gas"};
    static double[] fuelPrice = {739,1600,958,1000};

    static String[] fuelHistory = new String[50];
    static double[] litreHistory = new double[50];
    static double[] amountHistory = new double[50];
    static String[] historyDate = new String[50];
    static int transactionCount = 0;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    
        System.out.println("Welcome to our Filling Station\n");
        int choice = -1;

        while (choice != 0){
            System.out.println("Available Petroleum");
            System.out.println("1. Buy Petroleum");
            System.out.println("2. Show Transaction History");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice){
                case 1: 
                    buyFuel(input);
                    break;
    
                case 2:
                   showTransactionHistory();
                    break;
            
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, try again");
                    System.out.println();
            }  
        }
    }

    public static void buyFuel(Scanner input){
        for (int count = 0; count < fuelNames.length; count++){
            System.out.println((count + 1) + ". " + fuelNames[count] + " @ " + fuelPrice[count]);
        }

        System.out.print("Choose an option: ");
        int fuelChoice = input.nextInt();

        if (fuelChoice < 1 || fuelChoice > fuelNames.length){
            System.out.println("Invalid choice");
            return;
        }

        int index = fuelChoice - 1;
        String fuel = fuelNames[index];
        double price = fuelPrice[index];

        String methodOfBuyingFuel = getBuyingMethod(input);

        double litres;
        double amount;

        if (methodOfBuyingFuel.equalsIgnoreCase("litres")){
            litres = getValidLitres(input);
            amount = calculateAmount(litres, price);
        }
        else if (methodOfBuyingFuel.equalsIgnoreCase("amount")){
            amount = getValidAmount(input, price);
            litres = calculateLitres(amount, price);
        }
        else {
            System.out.println("Invalid input");
            return;
        }

        saveTransaction(fuel, litres, amount);
        printReceipt(fuel, litres, amount);
    }
   
    public static String getBuyingMethod(Scanner input){
        System.out.print("Litres or Amount? ");
        input.nextLine();
        String methodOfBuyingFuel = input.nextLine();
        return methodOfBuyingFuel;
    }

    public static double getValidLitres(Scanner input){
        double litres;
        while (true){
            System.out.print("How many litres of fuel are you buying? ");
            litres = input.nextDouble();

            if (litres >= 1 && litres <= 50){
                break;
            }
            else {
                System.out.println("Litres must be between 1-50");
            }
        }
        return litres;
    }

    public static double getValidAmount(Scanner input, double price){
        double amount;
        while (true){
            System.out.print("How much are you buying? ");
            amount = input.nextDouble();

            if (amount >= price){
                break;
            }
            else {
                System.out.println("Amount must be more than litre price");
            }
        }
        return amount;
    }

    public static double calculateAmount(double litres, double price){
        double amount = litres * price;
        return amount;
    }

    static double calculateLitres(double amount, double price){
        double litres = amount / price;
        return litres;
    }

    public static void saveTransaction(String fuel, double litres, double amount){
        if (transactionCount >= fuelHistory.length){
            System.out.println("Transaction history full");
            return;
        }

        fuelHistory[transactionCount] = fuel;
        litreHistory[transactionCount] = litres;
        amountHistory[transactionCount] = amount;
        historyDate[transactionCount] = LocalDate.now().toString();
        transactionCount++;

        System.out.println("Saving transaction history...\n");
    }


    public static void printReceipt(String fuel, double litres, double amount){
        System.out.println("Customer's Transaction Receipt");
        System.out.println("===========================================");
        System.out.println("Product: " + fuel);
        System.out.println("Amount: #" + amount);
        System.out.println("Litres: " + litres + "L");
        System.out.println("Thank you for your patronage");
        System.out.println("===========================================\n");
    }

    public static void showTransactionHistory(){
        if (transactionCount == 0){
            System.out.println("No transactions found\n");
            return;
        }

        for (int count = 0; count < transactionCount; count++){
            System.out.println("===========================================");
            System.out.println("Product: " + fuelHistory[count]);
            System.out.println("Amount: #" + amountHistory[count]);
            System.out.println("Litres: " + litreHistory[count] + "L");
            System.out.println("Date: " + historyDate[count]);
            System.out.println("===========================================\n");
        }
    }
}
