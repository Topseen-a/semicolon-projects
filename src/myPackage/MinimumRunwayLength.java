package myPackage;

import java.util.Scanner;
    public class MinimumRunwayLength{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter velocity in m/s: ");
        double velocity = input.nextDouble();

        System.out.print("Enter acceleration in m/s^2: ");
        double acceleration = input.nextDouble();

        double runwayLength = (velocity * velocity) / (2 * acceleration);
        System.out.println("The minimum runway length is: " +  runwayLength);
        }
    }
