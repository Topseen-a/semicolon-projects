package geoPoliticalZone;

import java.util.Scanner;

public class GeoPoliticalZoneMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your state: ");
        String state = input.nextLine();

        boolean isFound = false;

        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            if (zone.containsState(state)) {
                System.out.println("Your Geo-Political Zone is: " + zone);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("State not found");
        }
    }
}
