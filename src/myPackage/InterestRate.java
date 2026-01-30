package myPackage;

import java.util.Scanner;
    public class InterestRate{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter annual percentage interest rate in (%): ");
        double annualPercentageInterestRate = input.nextDouble();

        double interest = balance * (annualPercentageInterestRate / 1200);
        System.out.println("The interest is: " +  interest);
        }
    }
