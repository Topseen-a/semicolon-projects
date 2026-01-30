package myPackage;

import java.util.Scanner;
        public class Square{
            public static void main(String[]args){
            
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer:");
            int numberOne = input.nextInt();

            System.out.print("Enter second integer:");
            int numberTwo = input.nextInt(); 
            
            int squareNumberOne = numberOne * numberOne;
            int squareNumberTwo = numberTwo * numberTwo;

            System.out.println("The square of number one is:" + squareNumberOne); 
            System.out.println("The square of number two is:" + squareNumberTwo);

            int sum = squareNumberOne + squareNumberTwo;
            System.out.println("The sum of their squares is:" + sum); 

            int difference = squareNumberOne - squareNumberTwo;
            System.out.println("THe difference of their squares is:" + difference);          
            }
        }
