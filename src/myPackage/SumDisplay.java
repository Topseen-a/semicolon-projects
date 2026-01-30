package myPackage;

import java.util.Scanner;
    public class SumDisplay{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String choice;

        do {
            System.out.print("Enter your first number: ");
            int numberOne = input.nextInt();

            System.out.print("Enter your second number: ");
            int numberTwo = input.nextInt();

            int sum = numberOne + numberTwo;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you wish to perform the operation again? yes/no: ");
            choice = input.next();
            }
            while (choice == "yes/no");

            System.out.println("Terminating");
        }
    }
