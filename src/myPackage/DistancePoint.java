package myPackage;

import java.util.Scanner;
    public class DistancePoint{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first x-coordiante point: ");
        double x1 = input.nextDouble();

        System.out.print("Enter first y-coordiante point: ");
        double y1 = input.nextDouble();

        System.out.print("Enter second x-coordiante point: ");
        double x2 = input.nextDouble();

        System.out.print("Enter second y-coordiante point: ");
        double y2 = input.nextDouble();

        if (x1 == x2){
            System.out.println("The points are perpendicular to Y-axis");
            }
        else if (y1 == y2){
            System.out.println("The points are perpendicular to X-asis");    
            }
        else {
            System.out.println("They are not perpendicular to any axis");
            }

        }






    }
