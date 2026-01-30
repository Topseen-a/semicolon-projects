package myPackage;

import java.util.Scanner;
    public class Even {
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
    
        boolean checkEven = Kata.isEven(number);
        if (checkEven) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        




        }



}
