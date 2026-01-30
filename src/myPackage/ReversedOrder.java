package myPackage;

import java.util.Scanner;
    public class ReversedOrder{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number to be reversed: ");
        int number = input.nextInt();

        int a = (number / 1000);
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;
        
        int reversedNumber = (d * 1000) + (c * 100) + (b * 10) + a;
        System.out.println("Reversed number is: " + reversedNumber);
        }
    }
