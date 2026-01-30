package myPackage;

import java.util.Scanner;
    public class Factorial{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long checkFactorial = Kata.factorialOf(number);
        System.out.println("Factorial is " + checkFactorial);
        }
        
    }
