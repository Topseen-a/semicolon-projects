package myPackage;

import java.util.Scanner;
    public class DistanceCovered{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter initial velocity (u) in meters: ");    
        double initialVelocity = input.nextDouble();

        System.out.print("Enter time span (t) in seconds: ");    
        double timeSpan = input.nextDouble();

        System.out.print("Enter acceleration (a) in m/s: ");    
        double acceleration = input.nextDouble();

        double distanceCovered = (initialVelocity * timeSpan) + 1 / 2 * (acceleration * timeSpan * timeSpan);

        System.out.println("The distance covered is: " +  distanceCovered);
        }
    }
