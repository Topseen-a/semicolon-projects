package myPackage;

import java.util.Scanner;
    public class Eggs{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("How many eggs do you have? ");
        int eggs = input.nextInt();

        int dozen = eggs / 12;
        int leftOverEggs = eggs % 12;
        int gross = eggs /144;

        if (eggs > 500) {
            System.out.println("Your number of eggs is " +  gross +  " gross, " + dozen + " dozen and " + leftOverEggs + " left over ");                    
            }           
        }
    }
