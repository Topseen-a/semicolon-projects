package myPackage;

import java.util.Scanner;
    public class NumberOfYears{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");       
        long minutes = input.nextLong();

        long dayInMinutes = 60 * 24;
        long yearInMinutes = dayInMinutes * 365;

        long days = minutes / dayInMinutes;
        long years = minutes / yearInMinutes;
        
        System.out.println(minutes + " minutes is approximately " +  years +  " years and "  +  days +  " days");
        }
    }
