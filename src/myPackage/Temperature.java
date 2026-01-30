package myPackage;

import java.util.Scanner;
    public class Temperature{
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's temperature: ");
        double temperature = input.nextDouble();

        if (temperature < 15){
            System.out.println("Cold");
            } 
        if (temperature >= 15 && temperature <= 30){
            System.out.println("Warm");
            }
        if (temperature >30){
            System.out.println("Hot");
            }       
        }        
    
    }
