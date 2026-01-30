package myPackage;

import java.util.Scanner;
public class ParkingCharges{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        double totalReceipt = 0.0;
        int customerNumber = 1;

        while(true){
            System.out.print("Enter hours parked for each customer or -1 to exit: ");
            double hours = input.nextDouble();

            if (hours == -1){
                break;        
            }
            else {
                double charge = calculateCharges(hours);
                totalReceipt += charge;

                System.out.println("Charge for customer " + customerNumber + " is " + charge);
                System.out.println("Running total is " + totalReceipt);

                customerNumber++;
            }
        }
        System.out.println("Total Receipts for yesterday is " + totalReceipt);
    }

    public static double calculateCharges(double hours){
        double charge = 2.00;
        if (hours > 3.0){
            charge += Math.ceil(hours - 3.0) * 0.50;
        }
        if (charge > 10.00){
            charge = 10.00;
        }
        return charge;
    }

}
