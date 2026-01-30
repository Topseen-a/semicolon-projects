package myPackage;

import java.util.Scanner;
public class FireDrillFourteen{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    int factorial = 1;

    for (int count = 1; count <= number; count++){
        factorial *= count;
        }
    System.out.println("The factorial is " + factorial);
    }
}
