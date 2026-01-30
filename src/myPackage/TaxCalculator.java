package myPackage;

import java.util.Scanner;
    public class TaxCalculator{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double taxRate = 0.15;
        double earnings = 30000;
        double excessEarnings = 0.20;
        
        for (int count = 1; count <= 3; count++){
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your earnings: ");
            double userEarnings = input.nextDouble();

            double tax;

            if (userEarnings <= earnings) {
                tax = userEarnings * taxRate;
                }
            else {
                double actualTax = earnings * taxRate;
                double excessTax = (userEarnings - earnings) * excessEarnings;
                tax = actualTax + excessTax;   
                }
            System.out.println("Citizen's total tax is " + tax);




            }






        }
    
    











    }
