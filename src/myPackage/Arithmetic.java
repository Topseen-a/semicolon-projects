package myPackage;

import java.util.Scanner;
    public class Arithmetic{
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int numberOne = input.nextInt();

        System.out.print("Enter second integer:");
        int numberTwo = input.nextInt();

        System.out.print("Enter third integer:");
        int numberThree = input.nextInt();

        int sum = numberOne + numberTwo + numberThree;
        System.out.println("The sum of the three integers is: " +  sum);

        int average = sum / 3;
        System.out.println("The average of the three integers is: " +  average);

        int product = numberOne * numberTwo * numberThree;
        System.out.println("The product of the three integers is: " +  product);   

        if (sum <= average && sum <= product){
                System.out.println("Sum is the smallest number  "  +  sum); 
            }
        else if (average <= sum && average <= product){
                System.out.println("Average is the smallest number  "  +  average);            
            }
        else {
                System.out.println("Product is the smallest number  "  +  product);                 
            }  
         
        if (sum >= average && sum >= product){
                System.out.println("Sum is the largest number  "  +  sum); 
            }
        else if (average >= sum && average >= product){
                System.out.println("Average is the largest number  "  +  average);            
            }
        else {
                System.out.println("Product is the largest number  "  +  product);                 
            }
        }    
    }
