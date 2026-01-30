package myPackage;

import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(isPerfectNumber(number));
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for (int count = 1; count < number; count++){
            if (number % count == 0){
                sum += count;
            }            
        }
        if (sum == number){
            return true;
        }
        else {
            return false;
        }
    }
}
