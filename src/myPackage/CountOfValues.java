package myPackage;

import java.util.Scanner;
    public class CountOfValues{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int positive = 0;
        int negative = 0;
        int zeros = 0;
    
        while(true){
            System.out.print("Enter a number or -1 to stop: ");
            int number = input.nextInt();

        if (number == -1){
            break;
            }

        if (number > 0){
            positive++;
            }
        else if (number < 0){
            negative++;
            }
        else {
            zeros++;
            }
        }
        System.out.println("Positive numbers are: " + positive);
        System.out.println("Negative numbers are: " + negative);
        System.out.println("Zeros: " + zeros);
        }
    }

