package myPackage;

import java.util.Scanner;
    public class SumDigit{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int firstNumber = number / 100;
        int secondNumber = (number /10) % 10;
        int thirdNumber = number % 10;

        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum is " + sum);


        }






    }
