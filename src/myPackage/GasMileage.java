package myPackage;

import java.util.Scanner;
    public class GasMileage{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int miles = 0;
        int gallon = 0;

        while(true){
        
            System.out.print("Enter number of miles driven or -1 to exit: ");
            int milesDriven = input.nextInt();

            if(milesDriven == -1){
                System.out.println("Exiting program");
                break;     
                } 

                System.out.print("Enter the number of gallons used: ");
                int gallonUsed = input.nextInt();

                double trip = milesDriven / gallonUsed;
                System.out.println("Miles per gallon is: " + trip);
                
                miles = miles + milesDriven;
                gallon = gallon + gallonUsed;

                double totalMilesPerGallon = miles / gallon;
                System.out.println("Combined miles per gallon is: " + totalMilesPerGallon);
                }
            }
    }
