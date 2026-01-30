package myPackage;

import java.util.Scanner;
    public class FireDrillFour{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number >= 0){
            System.out.println(number + " is positive");    
            }
        else{
            System.out.println(number + " is negative"); 
            }
        
        }
    }
