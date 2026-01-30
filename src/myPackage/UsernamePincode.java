package myPackage;

import java.util.Scanner;
    public class UsernamePincode{
        public static void main(String[]args){
        
        String username = "Topseen";
        int pincode = 123456;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String usernameTwo = input.nextLine();

        System.out.print("Enter your pincode: ");
        int pincodeTwo = input.nextInt();

        if (usernameTwo.equals(username) && pincodeTwo == pincode){
            System.out.println("Login successful");
            }
        else {
            System.out.println("Login failed");           
             }
        }
    }
