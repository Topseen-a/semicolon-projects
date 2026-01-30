package myPackage;

import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();   

        System.out.println(leapYear(year)); 
    }

    public static boolean leapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else {
            return false;
        }
    }
}
