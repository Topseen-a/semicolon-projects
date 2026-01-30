package myPackage;

import java.util.Scanner;
    public class FireDrillTwo{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter another number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter another number: ");
        int thirdNumber = input.nextInt();


        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;
            
        int smallest = firstNumber;
        int largest = firstNumber;

        if (secondNumber < smallest) smallest = secondNumber;
        if (secondNumber > largest) largest = secondNumber;
        if (thirdNumber < smallest) smallest = thirdNumber;
        if (thirdNumber > largest) largest = thirdNumber;  
        

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The product is " + product);
        System.out.println("The smallest is " + smallest);
        System.out.println("The largest is " + largest);
        
        }



    }
