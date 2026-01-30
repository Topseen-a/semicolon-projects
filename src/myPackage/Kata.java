package myPackage;

public class Kata{
    public static void main(String[] args){

    System.out.println(isPrimeNumber(5));
}
    
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        } 
        else {
            return false;
        }
    }

    public static int getPositiveDifference(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber - secondNumber;
        }
        else {
            return secondNumber - firstNumber;
        }
    }

    public static float getDivision(int firstNumber, int secondNumber){
        if(secondNumber == 0){
            return 0;
        }
        else {
            return firstNumber / secondNumber;
        }
    }

    public static int factorOf(int number){
        int factor = 0;
        for (int index = 1; index <= number; index++){
            if (number % index == 0){
                factor ++;
            }      
        }
        return factor;
    }

    public static int factorialOf(int number){
        int factorial = 1;
        for (int count = 1; count <= number; count++){
            factorial *= count;
        }
        return factorial;
    }

    public static boolean isSquare(int number){
        double result = Math.sqrt(number);
        if (result * result == number){
            return true;
        }
        else {
            return false;        
        }
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

    public static long squareOf(int number){
        int result = number * number;
        return result;
    }

    public static boolean isPrimeNumber(int number){
        if (number <= 1){
            return false;        
        }

        for (int count = 2; count <= number / 2; count++){
            if (number % count == 0){
                return false;
            }
        }
        return true;
    }
}
