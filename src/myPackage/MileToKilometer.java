package myPackage;

import java.util.Scanner;
    public class MileToKilometer{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double mile = input.nextDouble();

        double kilometer = mile * 1.6;

        System.out.println(mile  + " miles is " + kilometer  + " kilometers ");
        }
    }
