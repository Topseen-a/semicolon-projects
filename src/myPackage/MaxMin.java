package myPackage;

import java.util.Scanner;
    public class MaxMin{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();

        int maximum = firstNumber;
        int minimum = firstNumber;    
    
    for (int count = 1; count < 5; count++){

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > maximum) maximum = number;
        if (number < minimum) minimum = number;

        }
    System.out.println("Maximum is " + maximum);
    System.out.println("Minimum is " + minimum);      



        }
    }
