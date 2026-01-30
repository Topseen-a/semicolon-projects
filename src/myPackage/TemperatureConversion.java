package myPackage;

import java.util.Scanner;
public class TemperatureConversion{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Conversion Menu ");
        System.out.println("1. Celsius to Kelvin ");
        System.out.println("2. Kelvin to Celsius ");
        System.out.print("Choose an option (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            System.out.println("Temperature in Kelvin is: " + toKelvin(celsius));
        } 
        else if (choice == 2){
            System.out.print("Enter temperature in Kelvin: ");
            double kelvin = input.nextDouble();
            System.out.printf("Temperature in Celsius is: " +  toCelsius(kelvin));
        }
        else {
            System.out.println("Invalid choice.");
        }
    }

    public static double toKelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double toCelsius(double kelvin){
        double celsius = kelvin - 273.15;       
        return celsius;
    }
}

