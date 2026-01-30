package myPackage;

import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(isPrimeNumber(number));
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
