package diaryApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Diaries diaries = new Diaries();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===== DIARY APPLICATION =====");
            System.out.println("1. Add Diary");
            System.out.println("2. Find Diary by Username");
            System.out.println("3. Delete Diary");
            System.out.println("4. Show Number of Diaries");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter username: ");
                    String username = input.nextLine();

                    System.out.print("Enter password: ");
                    String password = input.nextLine();

                    try {
                        diaries.add(username, password);
                        System.out.println("Diary added successfully");
                    } catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter username to search: ");
                    String searchUser = input.nextLine();

                    Diary diary = diaries.findByUserName(searchUser);

                    if (diary != null) {
                        System.out.println("Diary found!");
                        System.out.println("Username: " + diary.getUserName());
                        System.out.println("Diary is locked: " + diary.isLocked());
                    } else {
                        System.out.println("Diary not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter username: ");
                    String deleteUser = input.nextLine();

                    System.out.print("Enter password: ");
                    String deletePassword = input.nextLine();

                    try {
                        diaries.delete(deleteUser, deletePassword);
                        System.out.println("Diary deleted successfully");
                    } catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Total diaries: " + diaries.getDiaries().size());
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
