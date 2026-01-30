package myPackage;

import java.util.Scanner;
public class HypothenusCalculation{    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double sideOne = input.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double sideTwo = input.nextDouble();

        double result = hypothenus(sideOne,sideTwo);
        
        System.out.println("The hypothenus is " + result);
    }

    public static double hypothenus(double sideOne, double sideTwo){
        double hypothenus = Math.pow(sideOne,2) + Math.pow(sideTwo,2);
        double result = Math.sqrt(hypothenus);
        return result;
    }
}
