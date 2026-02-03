package geoPoliticalZone;

import java.util.Scanner;

public class GeoPoliticalZoneMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GeoPoliticalZone geoPoliticalZone = new GeoPoliticalZone();

        String choice;

        do {
            System.out.print("Enter your state: ");
            String state = input.nextLine();

            geoPoliticalZone.checkZone(state);

            System.out.print("Do you want to check another state (yes/no)? ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using our App");
    }
}
