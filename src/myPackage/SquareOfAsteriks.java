package myPackage;

import java.util.Scanner;
public class SquareOfAsteriks{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int number = input.nextInt();

        squareOfAsteriks(number);
    }
 
    public static void squareOfAsteriks(int number){
        for (int row = 1; row <= number; row++){
            for (int column = 1; column <= number; column++){
                System.out.print("*");
            }   
            System.out.println();
        }
    }   
}
