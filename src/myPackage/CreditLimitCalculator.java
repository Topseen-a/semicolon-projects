package myPackage;

import java.util.Scanner;
    public class CreditLimitCalculator{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter account number or -1 to exit: ");
            int accountNumber = input.nextInt();

            if(accountNumber == -1){
                System.out.println("Exiting program");
                break;
            }

            System.out.print("Enter balance at the beginning of the money: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total of all items charged: ");
            int totalItems = input.nextInt();

            System.out.print("Enter total of all credits: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + totalItems - totalCredits;

            System.out.println("New balance is " + newBalance);

            if(newBalance > creditLimit){
                System.out.println("Credit limit is exceeded");
            }
            else {
                System.out.println("Credit limit is okay.");
                }
            }
        }
    }
