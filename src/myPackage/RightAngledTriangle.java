package myPackage;

import java.util.Scanner;
    public class RightAngledTriangle {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of base between (1-10): ");
        int lengthOfBase = input.nextInt();

        while (lengthOfBase < 1 || lengthOfBase > 10) {
            System.out.print("Enter a number between 1 and 10: ");
            lengthOfBase = input.nextInt();
        }

        for (int index = 1; index <= lengthOfBase; index++) {
            for (int count = 1; count <= index; count++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
