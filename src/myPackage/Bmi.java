package myPackage;

import java.util.Scanner;
    public class Bmi{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double kilogramToOnePound= 0.45359237;
        double metersToOneInch = 0.0254;

        double weightInKilogram = weightInPounds * kilogramToOnePound;
        double heightInMeters = heightInInches * metersToOneInch;

        double bmi = weightInKilogram / (heightInMeters * heightInMeters);
    
        System.out.println("BMI is " +  bmi);
        }
    }
