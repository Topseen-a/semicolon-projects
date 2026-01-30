package myPackage;

import java.util.Scanner;
    public class FireDrillOne{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter another number: ");
        int secondNumber = input.nextInt();

        int firstNumberSquared = firstNumber * firstNumber;
        int secondNumberSquared = secondNumber * secondNumber;

        int sumOfSquares = firstNumberSquared + secondNumberSquared;
        
        int differenceOfSquares = firstNumberSquared - secondNumberSquared;

        System.out.println("The square of the first number is " + firstNumberSquared);
        System.out.println("The square of the second number is " + secondNumberSquared);
        System.out.println("The sum of the squares is " + sumOfSquares);
        System.out.println("THe difference of the squares is " + differenceOfSquares);
        
        }



    }
