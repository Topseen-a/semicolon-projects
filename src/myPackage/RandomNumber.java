package myPackage;

import java.util.Random;
import java.util.Scanner;
    public class RandomNumber{
        public static void main(String[] args){

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(1,20);

        int guess = 0;

        System.out.println("Guess a number between 1-20: ");

        while (guess != randomNumber) {
            System.out.print("Guess the number: ");
            guess = input.nextInt();

            if (guess > randomNumber){
                System.out.println("Too high, try again");
                }
            else if (guess < randomNumber) {
                System.out.println("Too low, try again");
                }
            else {
                System.out.println("Your guess is correct");            
                }
            }
        }
    }
