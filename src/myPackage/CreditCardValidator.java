package myPackage;

import java.util.Scanner;
public class CreditCardValidator{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your card number: ");
        String cardNumber = input.nextLine();

        if (!isValidLength(cardNumber)){
            System.out.println("Invalid credit card length.");
            return;
        }

        String cardType = getCardType(cardNumber);

        if (cardType.equals("Unknown")){
            System.out.println("Invalid card type.");
            return;
        }

        System.out.println("Credit Card Type: " + cardType);
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Digit Length: " + cardNumber.length());

        boolean isValid = isValidCard(cardNumber);
        if (isValid){
            System.out.println("Credit Card Status: Valid");
        } 
        else {
            System.out.println("Credit Card Status: Invalid");
        }
    }

    public static boolean isValidLength(String cardNumber){
        if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
            return true;
        }
        else {
            return false;
        }    
    }

    public static String getCardType(String cardNumber){
        if (cardNumber.startsWith("4")){
            return "Visa Card";
        }
        else if (cardNumber.startsWith("5")){
            return "MasterCard";
        }
        else if (cardNumber.startsWith("37")){
            return "American Express Card";
        }
        else if (cardNumber.startsWith("6")){
            return "Discover Card";
        }
        else {
            return "Unknown";
        }
    }

    public static boolean isValidCard(String cardNumber){
        int sumEven = sumOfDoubleEvenPlace(cardNumber);
        int sumOdd = sumOfOddPlace(cardNumber);
        return (sumEven + sumOdd) % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(String cardNumber){
        int sum = 0;
        for (int count = cardNumber.length() - 2; count >= 0; count -= 2){
            int digit = Character.getNumericValue(cardNumber.charAt(count));
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    public static int getDigit(int number){
        if (number < 10){
            return number;
        }
        else {
            return (number / 10) + (number % 10);
        }
    }

    public static int sumOfOddPlace(String cardNumber){
        int sum = 0;
        for (int count = cardNumber.length() - 1; count >= 0; count -= 2){
            sum += Character.getNumericValue(cardNumber.charAt(count));
        }
        return sum;
    }    
}
