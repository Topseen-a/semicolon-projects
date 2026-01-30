package myPackage;

import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four digit integer: ");
        int digit = input.nextInt();

        System.out.println(sumOfDigit(digit));
    }

    public static int sumOfDigit(int digit){
        int digitOne = digit / 1000;
        int digitTwo = (digit / 100) % 10;
        int digitThree = (digit / 10) % 10;
        int digitFour = digit % 10;

        int sum = digitOne + digitTwo + digitThree + digitFour;
        return sum;
    }
}
