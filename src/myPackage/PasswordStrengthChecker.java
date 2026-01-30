package myPackage;

import java.util.Scanner;
    public class PasswordStrengthChecker{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        int password = input.nextInt();

        if (password < 6) {
            System.out.println("Password is weak");
            } 
        else if (password <= 10) {
            System.out.println("Password strength: Weak");
            } 
        else if (password <= 10) {
            System.out.println("Password strength: Medium");
            } 
        else {
            System.out.println("Password strength: Strong");
            }
        }
    }
