package myPackage;

import java.util.Scanner;
    public class NegativePositiveZeros{
        public static void main(String... args){
    
            Scanner input = new Scanner(System.in);
            
            int positive = 0;
            int negative = 0;
            int zero = 0;

            for (int count = 1; count <= 5; count++){

                System.out.print("Enter a number: ");
                int number = input.nextInt();
                
                if (number > 0){
                    positive++;
                }
                else if (number < 0){
                    negative++;
                }
                else {
                    zero++;
                }
            }
            System.out.println("Positive numbers are: " + positive);
            System.out.println("Negative numbers are: " + negative);
            System.out.println("Zeros are: " + zero);
        }
    }
