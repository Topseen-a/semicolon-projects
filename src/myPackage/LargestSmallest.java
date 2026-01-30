package myPackage;

import java.util.Scanner;
    public class LargestSmallest{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a set of integers or -1 to exit: ");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;

        while (true){

            System.out.print("Enter a set of integers or -1 to exit: ");
            number = input.nextInt();

            if (number == -1){
                break;
                }
            if (number > largest){
                largest = number;
                }
            if (number < smallest){
                smallest = number;        
                }
            }
        System.out.println("The largest is " + largest);
        System.out.println("The smallest is " + smallest);
        }
    }
