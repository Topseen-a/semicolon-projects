package myPackage;

import java.util.Scanner;
    public class LargestNumber{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number = 0;
        int largest = number;

        for (int count = 1; count <= 10; count++){
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (largest < number){
                largest = number;
                }
            }
        System.out.println("The largest is: " + largest);
        }
    }
