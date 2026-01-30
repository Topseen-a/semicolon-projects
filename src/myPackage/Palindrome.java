package myPackage;

import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit integer: ");   
        int digit = input.nextInt();

        System.out.println(isPalindrome(digit));         
    }

    public static boolean isPalindrome(int number){
        int firstNumber = number / 10000;
        int secondNumber = (number / 1000) % 10;
        int thirdNumber = (number / 100) % 10;
        int fourthNumber = (number / 10) % 10;
        int fifthNumber = number % 10;

        if (firstNumber == fifthNumber && secondNumber == fourthNumber){
            return true;
        }
        else {
            return false;
        }
    }
}
