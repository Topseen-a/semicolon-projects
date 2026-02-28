package turtleGraphics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Turtle ijapa = new Turtle();
        SketchPad sketchPad = new SketchPad(20);

        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO TURTLE GRAPHICS GAME");
        System.out.println("================================");
        System.out.println("1 → Pen Up");
        System.out.println("2 → Pen Down");
        System.out.println("3 → Turn Right");
        System.out.println("4 → Turn Left");
        System.out.println("5 → Move Forward");
        System.out.println("6 → Display SketchPad");
        System.out.println("9 → Exit Program");
        System.out.println("================================");

        while (true) {
            System.out.println("Choose option:");
            int option = input.nextInt();

            switch (option) {
                case 1 -> ijapa.movePenUp();
                case 2 -> ijapa.movePenDown();
                case 3 -> ijapa.turnRight();
                case 4 -> ijapa.turnLeft();
                case 5 -> {
                    try {
                        System.out.println("Enter steps:");
                        int steps = input.nextInt();
                        ijapa.moveForward(steps, sketchPad);

                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 6 -> sketchPad.display();
                case 9 -> {
                    System.out.println("Game ended");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
