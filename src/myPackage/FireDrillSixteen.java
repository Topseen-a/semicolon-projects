package myPackage;

import java.util.Scanner;
public class FireDrillSixteen{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    if (number % 5 == 0 && number % 10 == 0){
        System.out.println("True");
        }
    else {
        System.out.println("False");
        }
    }
}
