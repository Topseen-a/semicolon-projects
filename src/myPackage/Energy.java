package myPackage;

import java.util.Scanner;
    public class Energy{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();

        System.out.print("Enter initial temperature of water: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter final temperature of water: ");
        double finalTemperature = input.nextDouble();

        double energyQ = amountOfWater * (finalTemperature - initialTemperature) * 4189;
        System.out.println("The energy needed is: " +  energyQ);
        }
    }
