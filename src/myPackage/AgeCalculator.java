package myPackage;//Create a Scanner for user input

//Prompt user to "Enter father's age (1-80): "
//Read input on fatherAge

//Prompt user to "Enter son's age (1-80): "
//Read input sonAge

//Calculate the  years = absolute value of (fatherAge - (2 * sonAge))

//Display "The father was twice as old as his son " + years + " years ago"


import java.util.Scanner;
    public class AgeCalculator{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter father's age (1-80): ");
        int fatherAge = input.nextInt();
    
        System.out.print("Enter son's age (1-80): ");
        int sonAge = input.nextInt();

        int years = Math.abs(fatherAge - (2 * sonAge));

        System.out.println("The father was twice as old as his son " + years + " years ago");     
        }
    }
