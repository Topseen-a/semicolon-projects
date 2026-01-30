package myPackage;

import java.util.Scanner;
    public class Acceleration{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the starting velocity (vo) in m/s: ");
        double startingVelocity = input.nextDouble();

        System.out.print("Enter the ending velocity (v1) in m/s: ");
        double endingVelocity = input.nextDouble();
        
        System.out.print("Enter the time span (t) in s: ");
        double timeSpan = input.nextDouble();  
        
        double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;
        System.out.println("The average acceleration is:  " + averageAcceleration);
        }
    }
