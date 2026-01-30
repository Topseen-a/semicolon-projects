package myPackage;

import java.util.Scanner;
public class CheckOutApp{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.print("What is the customer's name? ");
        String customerName = input.nextLine();

        String[] items = new String[100];
        int[] quantityOfItems = new int[100];
        double[] prices = new double[100];

        int numberOfItems = 0;
        double subTotal = 0;

        while(true){
            System.out.print("What did the user buy? ");
            items[numberOfItems] = input.nextLine();

            System.out.print("How many pieces? ");
            quantityOfItems[numberOfItems] = input.nextInt();

            System.out.print("How much per unit? ");
            prices[numberOfItems] = input.nextDouble();

            subTotal += quantityOfItems[numberOfItems] * prices[numberOfItems];
            numberOfItems++;

            System.out.print("Add more items (yes/no)? ");
            input.nextLine();
            String choice = input.nextLine();
    
            if (choice.equalsIgnoreCase("no")){
                break;
            }
        }

        System.out.print("What is your name? ");
        String cashierName = input.nextLine();

        System.out.print("How much discount will he get? ");
        double discountInput = input.nextDouble();

        double discount = (discountInput / 100) * subTotal;
        double vat = 0.075 * (subTotal - discount);
        double totalBill = subTotal - discount + vat;
    
        System.out.println();
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===========================================");
        System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");
        System.out.println("-------------------------------------------");

        for (int index = 0; index < numberOfItems; index++){
            double total = quantityOfItems[index] * prices[index];
            System.out.println(items[index] + "\t" + quantityOfItems[index] + "\t" + prices[index] + "\t" + total);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Sub Total: \t" + subTotal);
        System.out.println("Discount: \t" + discount);
        System.out.println("Vat @ 7.5%: \t" + vat);
        System.out.println("===========================================");
        System.out.println("Bill Total: \t" + totalBill);
        System.out.println("===========================================");
        System.out.println("THIS IS NOT A RECEIPT, KINDLY PAY " + totalBill);
        System.out.println("===========================================");

        System.out.print("How much did the customer give to you? ");
        double amountPaid = input.nextDouble();

        double balance = amountPaid - totalBill;

        System.out.println();
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===========================================");
        System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");
        System.out.println("-------------------------------------------");

        for (int index = 0; index < numberOfItems; index++){
            double total = quantityOfItems[index] * prices[index];
            System.out.println(items[index] + "\t" + quantityOfItems[index] + "\t" + prices[index] + "\t" + total);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Sub Total: \t" + subTotal);
        System.out.println("Discount: \t" + discount);
        System.out.println("Vat @ 7.5%: \t" + vat);
        System.out.println("===========================================");
        System.out.println("Bill Total: \t" + totalBill);
        System.out.println("Amount Paid: \t" + amountPaid);
        System.out.println("Balance: \t" + balance);
        System.out.println("===========================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("===========================================");
        
    }
}
