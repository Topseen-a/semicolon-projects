package myPackage;

import java.util.Scanner;
    public class FutureValue{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in %: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        double monthlyInterestRate = annualInterestRate / (100 * 12);
        
        double futureInvestment = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.println("Future value is " +  futureInvestment);
        }
    }
