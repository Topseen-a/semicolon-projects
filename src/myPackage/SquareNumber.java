package myPackage;

import java.util.Scanner;
    public class SquareNumber{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean checkSquareNumber = Kata.isSquare(number);
        if (checkSquareNumber){
            System.out.println("True");
            } else {
                System.out.println("False");
                }



        }
    }
