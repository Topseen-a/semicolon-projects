package myPackage;

import java.util.Random;
import java.util.Scanner;
    public class GuessNumber{
        public static void main(String[] args){

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(1,1001);

        int guess = 0;

        System.out.println("Guess a number between 1-1000: ");

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
