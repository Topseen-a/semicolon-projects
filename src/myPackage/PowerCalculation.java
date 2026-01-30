package myPackage;

import java.util.Scanner;
    public class PowerCalculation{ 
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter the second number: ");
        int numberTwo = input.nextInt();

        int result = 1;        
        
        for (int index = 1; index <= numberTwo; index++) {
            result *= numberOne;
            }

        System.out.println(numberOne + " raised to power " + numberTwo + " is " + result);
        }
    }
