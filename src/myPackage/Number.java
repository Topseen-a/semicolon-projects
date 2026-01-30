package myPackage;

import java.util.Scanner;
    public class Number{
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int numberOne = input.nextInt();

        System.out.print("Enter second integer: ");
        int numberTwo = input.nextInt();

        System.out.print("Enter third integer: ");
        int numberThree = input.nextInt();

        int largest = numberOne;

        if (numberTwo > largest && numberTwo > numberThree){
            System.out.println("The largest number is: "  +  numberTwo);
        }

}
    
}
