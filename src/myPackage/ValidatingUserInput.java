package myPackage;

import java.util.Scanner;
    public class ValidatingUserInput{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 0r 2: ");
        int number = input.nextInt();

        while (number != 1 && number != 2){

            System.out.print("Invalid input. Enter 1 or 2: ");
            number = input.nextInt();

            }
        System.out.println("You entered the correct number: " + number);
        }
 
    }
