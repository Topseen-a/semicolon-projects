package myPackage;

import java.util.Scanner;
    public class Extremes{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("How many numbers will you enter? ");
            int numberCount = input.nextInt();

            System.out.print("Enter the first number: ");
            int number = input.nextInt();

            int minimum = number;
            int maximum = number;

            for (int count = 2; count <= numberCount; count++){
                System.out.print("Enter the next number: ");
                number = input.nextInt();

                if(number < minimum){
                    minimum = number;
                }
                if(number > maximum){
                    maximum = number;
                }
            }
            
            int sum = minimum + maximum;

            System.out.println("The minimum is: " + minimum);
            System.out.println("The maximum is: " + maximum);
            System.out.println("The sum is: " + sum);
        }
    }
