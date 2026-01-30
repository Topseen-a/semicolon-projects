package myPackage;

import java.util.Scanner;
    public class EvenOddIntegers{
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the first integer: ");        
        int numberOne = input.nextInt();

        System.out.print("Enter the second integer: ");
        int numberTwo = input.nextInt();

        System.out.print("Enter the third integer: ");
        int numberThree = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        int numberFour = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        int numberFive = input.nextInt();
        
        int even = 0;
        int odd = 0;

        if (numberOne % 2 == 0){
            even = even + numberOne;        
            }
        else {
            odd = odd + numberOne;             
            }

        if (numberTwo % 2 == 0){
            even = even + numberTwo;        
            }
        else {
            odd = odd + numberTwo;             
            }

        if (numberThree % 2 == 0){
            even = even + numberThree;        
            }
        else {
            odd = odd + numberThree;             
            }

        if (numberFour % 2 == 0){
            even = even + numberFour;        
            }
        else {
            odd = odd + numberFour;             
            }

        if (numberFive % 2 == 0){
            even = even + numberFive;        
            }
        else {
            odd = odd + numberFive;             
            }
    
        System.out.println("The sum of even number is: "  +  even);
        System.out.println("The sum of odd number is: "  +  odd);
        }    
    }
