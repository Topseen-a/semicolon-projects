package myPackage;

import java.util.Scanner;
        public class ComparingIntegers{
            public static void main(String[]args){
            
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number:");
            int number = input.nextInt();
            
            int squareNumber = number * number;
            System.out.println("The square of the number is:" + squareNumber);

            int value = 100;
        
            if (number > 100 && squareNumber > 100){
                System.out.println("The number and its square is greater than " +  value);                
                }

            if (number == 100 && squareNumber == 100){
                System.out.println("The number and its square is equal to " +  value);            
                }

            if (number != 100 && squareNumber != 100){
                System.out.println("The number is not equal to " +  value);
                }

            if (number < 100 && squareNumber < 100){
                System.out.println("The number is not equal to " +  value);
                }
            }
        }
