package myPackage;// Create scanner for user input

//Prompt user to enter a year
//Read input from the user

//if year modulo 4 equals 0 and year modulo 100 is not equal to 0 or year modulo 400 equals 0
//Display year is a leap year

//else display year is not a leap year


import java.util.Scanner;
    public class LeapYearChecker{
        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year");    
            }
        else {
            System.out.println(year + " is not a leap year");    
            }
        }
    }
