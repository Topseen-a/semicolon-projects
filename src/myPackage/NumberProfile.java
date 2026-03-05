package myPackage;

import java.util.Scanner;

public class NumberProfile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        getFactsAboutNumber(number);
    }

    public static void getFactsAboutNumber(int number) {
        getEvenOrOdd(number);
        checkSquare(number);
        getPerfectNumber(number);
        getFactorial(number);
        getFactor(number);
        getPrimeOrComposite(number);
        getSquare(number);
        isPalindrome(number);
        getNaturalNumber(number);
        getPositiveNegativeNumber(number);
    }

    public static void getEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
    }

    public static void checkSquare(int number) {
        int result = (int) Math.sqrt(number);
        if (result * result == number) {
            System.out.println(number + " is a square");
        }
    }

    public static void getPerfectNumber(int number) {
        int sum = 0;
        for (int count = 1; count < number; count++){
            if (number % count == 0){
                sum += count;
            }
        }
        if (sum == number) System.out.println(number + " is a perfect number");
    }

    public static void getFactorial(int number) {
        long factorial = 1;
        for (int count = 1; count <= number; count++) {
            factorial *= count;
        }
        System.out.println(factorial + " is the factorial of " + number);
    }

    public static void getFactor(int number) {
        for (int count = 1; count <= number; count++){
            if (number % count == 0){
                System.out.println(count + " is a factor of " + number);
            }
        }
    }

    public static void getPrimeOrComposite(int number) {
        if (number <= 1) {
            return;
        }

        for (int count = 2; count <= number / 2; count++) {
            if (number % count == 0) {
                System.out.println(number + " is a composite number");
                return;
            }
        }
        System.out.println(number + " is a prime number");
    }

    public static void getSquare(int number) {
        int result = number * number;
        System.out.println("The square of " + number + " is " + result);
    }

    public static void isPalindrome(int number) {
        int firstNumber = number / 10000;
        int secondNumber = (number / 1000) % 10;
        int thirdNumber = (number / 100) % 10;
        int fourthNumber = (number / 10) % 10;
        int fifthNumber = number % 10;

        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            System.out.println(number + " is a palindrome");
        }
    }

    public static void getNaturalNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a natural number");
        }
    }

    public static void getPositiveNegativeNumber(int number) {
        if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is a positive number");
        }
    }
}













