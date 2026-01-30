package myPackage;

import java.util.Scanner;
    public class BarChart{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int number;

            for(int count = 1; count <= 5; count++){
                System.out.print("Enter a number: ");
                number = input.nextInt();
                for(int index = 1; index <= number; index++){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    }
