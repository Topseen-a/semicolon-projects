package myPackage;

import java.util.Scanner;
public class MiniParkingSystem{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] parkingSlot = new int[20];
        int choice = -1;

        while (choice != 0){
            System.out.println("Welcome to Mini Parking System. ");
            System.out.println();
            System.out.println("1. Park car automatically");
            System.out.println("2. Choose a slot to park your car ");
            System.out.println("3. Remove your car from the slot ");
            System.out.println("4. Display parking status ");
            System.out.println("0. Exit the app ");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    parkAutomatically(parkingSlot);
                    break;

                case 2:
                    chooseSlot(parkingSlot, input);
                    break;

                case 3:
                    removeCar(parkingSlot, input);
                    break;

                case 4:
                    displayParkingStatus(parkingSlot);
                    break;

                case 0:
                    System.out.println("Exiting app...");
                    break;

                default:
                    System.out.println("Invalid choice, choose a valid option.");
                    System.out.println();
            }
        }
    }

    public static void parkAutomatically(int[] parkingSlot){
        int index;
        for (index = 0; index < parkingSlot.length; index++){
            if (parkingSlot[index] == 0){
                parkingSlot[index] = 1;
                System.out.println("Your car is parked at slot " + (index + 1));
                System.out.println();
                return;
            }
        }
        System.out.println("Parking lot is full");
        System.out.println();
    }

    public static void chooseSlot(int[] parkingSlot, Scanner input){
        System.out.print("Enter a slot to park from (1-20): ");
        int slotChoice = input.nextInt();

        if (slotChoice < 1 || slotChoice > 20){
            System.out.println("Invalid choice");
        } 
        else if (parkingSlot[slotChoice - 1] == 1){
            System.out.println("Slot already occupied");
        } 
        else {
            parkingSlot[slotChoice - 1] = 1;
            System.out.println("Your car is parked at slot " + slotChoice);
        }
        System.out.println();
    }

    public static void removeCar(int[] parkingSlot, Scanner input){
        System.out.print("Enter the slot number to remove your car: ");
        int removeSlotNumber = input.nextInt();

        if (removeSlotNumber < 1 || removeSlotNumber > 20){
            System.out.println("Invalid choice");
        } 
        else if (parkingSlot[removeSlotNumber - 1] == 0){
            System.out.println("Slot already empty");
        } 
        else {
            parkingSlot[removeSlotNumber - 1] = 0;
            System.out.println("Your car is removed from slot " + removeSlotNumber);
        }
        System.out.println();
    }

    public static void displayParkingStatus(int[] parkingSlot){
        System.out.println();
        System.out.println("Parking status:");
        for (int count = 0; count < parkingSlot.length; count++){
            String status = "";
            if (parkingSlot[count] == 0){
                status = "Empty";                
            }
            else {
                status = "Occupied";
            }
            System.out.println("Slot " + (count + 1) + ": " + status);
        }
        System.out.println();
    }
}

