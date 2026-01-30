package myPackage;

import java.util.Scanner;
    public class Comparator{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter another number: ");
        int numberTwo = input.nextInt();

        if (numberOne == numberTwo){
            System.out.println("0");
            }
        else if (numberOne > numberTwo){
            System.out.println("1");
            }
        else {
            System.out.println("-1");
            }


    }
    


}
