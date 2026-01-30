package myPackage;

import java.util.Scanner;
    public class MaximumMinimum{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter the second number: ");
    int secondNumber = input.nextInt();

    System.out.print("Enter the third number: ");
    int thirdNumber = input.nextInt();

    System.out.print("Enter the fourth number: ");
    int fourthNumber = input.nextInt();

    System.out.print("Enter the fifth number: ");
    int fifthNumber = input.nextInt();

    int maximum = firstNumber;
    int minimum = firstNumber;

    if (secondNumber > maximum) maximum = secondNumber;
    if (thirdNumber > maximum) maximum = thirdNumber;
    if (fourthNumber > maximum) maximum = fourthNumber;
    if (fifthNumber > maximum) maximum = fifthNumber;

    if (secondNumber < minimum) minimum = secondNumber;
    if (thirdNumber < minimum) minimum = thirdNumber;
    if (fourthNumber < minimum) minimum = fourthNumber;
    if (fifthNumber < minimum) minimum = fifthNumber;

    System.out.println("Maximum is " + maximum);
    System.out.println("Minimum is " + minimum);


    }
}
