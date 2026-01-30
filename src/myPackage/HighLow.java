package myPackage;

import java.util.Scanner;
    public class HighLow{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        
        int number = 50;

        while(true){

            System.out.print("Enter your number: ");
            int numberEntered = input.nextInt();

            if (numberEntered > number){
                System.out.println("Too high");
                }
            else if (numberEntered < number){
                System.out.println("Too low");
                }
            else{
            System.out.println("Correct value");
                break;
                }        
            }
        
        }

    }
