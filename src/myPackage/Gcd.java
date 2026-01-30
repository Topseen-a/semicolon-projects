package myPackage;

import java.util.Scanner;
public class Gcd{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter another number: ");
        int numberTwo = input.nextInt();

        System.out.println(isGcd(numberOne,numberTwo));
    }

    public static int isGcd(int numberOne, int numberTwo){
        int gcd = 1;
        for (int count = 1; count <= numberOne && count <= numberTwo; count++){
            if (numberOne % count == 0 && numberTwo % count == 0){
                gcd = count;
            }   
        }
        return gcd;
    }
}
