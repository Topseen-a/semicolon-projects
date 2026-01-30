package myPackage;

import java.util.Scanner;
    public class Factor{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int checkFactor = Kata.factorOf(number);
        System.out.println(checkFactor);

        }




    }
