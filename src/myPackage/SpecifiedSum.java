package myPackage;

import java.util.Scanner;
    public class SpecifiedSum{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();

        int sum = 0;
    
    while(sum < firstNumber){
        System.out.print("Enter a number: ");
        int secondNumber = input.nextInt();

        sum += secondNumber;
        
        System.out.println("Current sum is : " + sum);


        }

        System.out.println("Final sum is: " + sum);

        }







    }
