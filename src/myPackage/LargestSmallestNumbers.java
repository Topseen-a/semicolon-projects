package myPackage;

import java.util.Scanner;
    public class LargestSmallestNumbers{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want or enter -1 to exit: ");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;

        while(true){
            
            System.out.print("Enter the number you want or enter -1 to exit: ");
            number = input.nextInt();

            if(number == -1) {
                break;
            }
            if(number > largest) {
            largest = number;
            }
            if (number < smallest) {
            smallest = number;
            }
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
}
