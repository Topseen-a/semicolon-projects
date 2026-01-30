package myPackage;

import java.util.Scanner;
    public class AreaOfTriangle{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter point x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter point y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter point X2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter point y2: ");
        double y2 = input.nextDouble();
    
        System.out.print("Enter point x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter point y3: ");
        double y3 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the triangle is: " +  area);
        }
    }
