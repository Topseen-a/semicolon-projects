package myPackage;

import java.util.Scanner;
    public class FireDrillThree{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number % 3 == 0){
            System.out.println(number + " is divisible by 3");    
            }
        else {
            System.out.println(number + " is not divisible by 3");
            }
        }
    }
