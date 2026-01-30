package myPackage;

import java.util.Scanner;
    public class NokiaMenuMapOne{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.println("List of menu options");
            System.out.println("1. Phone book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM services");
            System.out.println("0. Exit");

            System.out.print("Select a number: ");
            int menuFunctions = input.nextInt();

            switch (menuFunctions) {
                case 1:
                    System.out.println("Phone Book Menu:");
                    System.out.println("1. Search");
                    System.out.println("2. Service Nos.");
                    System.out.println("3. Add name");
                    System.out.println("4. Erase");
                    System.out.println("5. Edit");
                    System.out.println("6. Assign tone");
                    System.out.println("7. Send b’card");
                    System.out.println("8. Options");
                    System.out.println("9. Speed dials");
                    System.out.println("10. Voice tags");
                    System.out.println("0. Back");

                    System.out.print("Select a number: ");
                    menuFunctions = input.nextInt();

                    switch (menuFunctions) {
                        case 1:
                            System.out.println("Search");
                            break;
                        case 2:
                            System.out.println("Service Nos.");
                            break;
                        case 3:
                            System.out.println("Add name");
                            break;
                        case 4:
                            System.out.println("Erase");
                            break;
                        case 5:
                            System.out.println("Edit");
                            break;
                        case 6:
                            System.out.println("Assign tone");
                            break;
                        case 7:
                            System.out.println("Send b’card");
                            break;
                        case 8:
                            System.out.println("Options Menu:");
                            System.out.println("1. Type of view");
                            System.out.println("2. Memory status");
                            System.out.println("0. Back");

                            System.out.print("Select a number: ");
                            menuFunctions = input.nextInt();

                            switch (menuFunctions) {
                                case 1:
                                    System.out.println("Type of view");
                                    break;
                                case 2:
                                    System.out.println("Memory status");
                                    break;
                            }
                            break;
                        case 9:
                            System.out.println("Speed dials");
                            break;
                        case 10:
                            System.out.println("Voice tags");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Messages Menu:");
                    System.out.println("1. Write messages");
                    System.out.println("2. Inbox");
                    System.out.println("3. Outbox");
                    System.out.println("4. Picture messages");
                    System.out.println("5. Templates");
                    System.out.println("6. Smileys");
                    System.out.println("7. Message settings");
                    System.out.println("8. Info service");
                    System.out.println("9. Voice mailbox number");
                    System.out.println("10. Service command editor");
                    System.out.println("0. Back");

                    System.out.print("Select a number: ");
                    menuFunctions = input.nextInt();

                    switch (menuFunctions) {
                        case 1:
                            System.out.println("Write messages");
                            break;
                        case 2:
                            System.out.println("Inbox");
                            break;
                        case 3:
                            System.out.println("Outbox");
                            break;
                        case 4:
                            System.out.println("Picture messages");
                            break;
                        case 5:
                            System.out.println("Templates");
                            break;
                        case 6:
                            System.out.println("Smileys");
                            break;
                        case 7:
                            System.out.println("Message Settings:");
                            System.out.println("1. Set 1");
                            System.out.println("2. Common 3");
                            System.out.println("0. Back");

                            System.out.print("Select a number: ");
                            menuFunctions = input.nextInt();

                            switch (menuFunctions) {
                                case 1:
                                    System.out.println("Set 1 selected");
                                    break;
                                case 2:
                                    System.out.println("Common 3 selected");
                                    break;
                            }
                            break;
                        case 8:
                            System.out.println("Info service");
                            break;
                        case 9:
                            System.out.println("Voice mailbox number");
                            break;
                        case 10:
                            System.out.println("Service command editor");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Chat");
                    break;

                case 4:
                    System.out.println("Call Register Menu:");
                    System.out.println("1. Missed calls");
                    System.out.println("2. Received calls");
                    System.out.println("3. Dialled numbers");
                    System.out.println("4. Erase recent call list");
                    System.out.println("5. Show call duration");
                    System.out.println("6. Show call costs");
                    System.out.println("7. Call cost settings");
                    System.out.println("8. Prepaid credit");
                    System.out.println("0. Back");

                    System.out.print("Select a number: ");
                    menuFunctions = input.nextInt();

                    switch (menuFunctions) {
                        case 1:
                            System.out.println("Missed calls");
                            break;
                        case 2:
                            System.out.println("Received calls");
                            break;
                        case 3:
                            System.out.println("Dialled numbers");
                            break;
                        case 4:
                            System.out.println("Erase recent call list");
                            break;
                        case 5:
                            System.out.println("Show call duration");
                            break;
                        case 6:
                            System.out.println("Show call costs");
                            break;
                        case 7:
                            System.out.println("Call cost settings");
                            break;
                        case 8:
                            System.out.println("Prepaid credit");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Tones Menu:");
                    System.out.println("1. Ringing tone");
                    System.out.println("2. Ringing volume");
                    System.out.println("3. Incoming call alert");
                    System.out.println("4. Composer");
                    System.out.println("5. Message alert tone");
                    System.out.println("6. Keypad tones");
                    System.out.println("7. Warning and game tones");
                    System.out.println("8. Vibrating alert");
                    System.out.println("9. Screen saver");
                    System.out.println("0. Back");

                    System.out.print("Select a number: ");
                    menuFunctions = input.nextInt();

                    switch (menuFunctions) {
                        case 1:
                            System.out.println("Ringing tone");
                            break;
                        case 2:
                            System.out.println("Ringing volume");
                            break;
                        case 3:
                            System.out.println("Incoming call alert");
                            break;
                        case 4:
                            System.out.println("Composer");
                            break;
                        case 5:
                            System.out.println("Message alert tone");
                            break;
                        case 6:
                            System.out.println("Keypad tones");
                            break;
                        case 7:
                            System.out.println("Warning and game tones");
                            break;
                        case 8:
                            System.out.println("Vibrating alert");
                            break;
                        case 9:
                            System.out.println("Screen saver");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Settings Menu:");
                    System.out.println("1. Call settings");
                    System.out.println("2. Phone settings");
                    System.out.println("3. Security settings");
                    System.out.println("4. Restore factory settings");
                    System.out.println("0. Back");

                    System.out.print("Select a number: ");
                    menuFunctions = input.nextInt();

                    switch (menuFunctions) {
                        case 1:
                            System.out.println("Call settings");
                            break;
                        case 2:
                            System.out.println("Phone settings");
                            break;
                        case 3:
                            System.out.println("Security settings");
                            break;
                        case 4:
                            System.out.println("Restore factory settings");
                            break;
                    }
                    break;

                case 7:
                    System.out.println("Call divert");
                    break;
                case 8:
                    System.out.println("Games");
                    break;
                case 9:
                    System.out.println("Calculator");
                    break;
                case 10:
                    System.out.println("Reminders");
                    break;
                case 11:
                    System.out.println("Clock Menu:");
                    System.out.println("1. Alarm clock");
                    System.out.println("2. Clock settings");
                    System.out.println("3. Date setting");
                    System.out.println("4. Stopwatch");
                    System.out.println("5. Countdown timer");
                    System.out.println("6. Auto update of date and time");
                    System.out.println("0. Back");

                    System.out.print("Select a number: ");
                    menuFunctions = input.nextInt();

                    switch (menuFunctions) {
                        case 1:
                            System.out.println("Alarm clock");
                            break;
                        case 2:
                            System.out.println("Clock settings");
                            break;
                        case 3:
                            System.out.println("Date setting");
                            break;
                        case 4:
                            System.out.println("Stopwatch");
                            break;
                        case 5:
                            System.out.println("Countdown timer");
                            break;
                        case 6:
                            System.out.println("Auto update of date and time");
                            break;
                    }
                    break;

                case 12:
                    System.out.println("Profiles");
                    break;
                case 13:
                    System.out.println("SIM services");
                    break;
            }
        }
    }

