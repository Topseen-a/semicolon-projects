package myPackage;

import java.util.Scanner;
    public class PoundsToKilogram{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number in pounds: ");
        double pound = input.nextDouble();

        double kilogram = 0.454 * pound;

        System.out.println(pound + "pounds is " +  kilogram  +  " kilograms");
        }
    }
