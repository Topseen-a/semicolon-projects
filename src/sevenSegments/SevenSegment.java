package sevenSegments;

import java.util.Scanner;

public class SevenSegment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 7 digits (0 or 1): ");
        String segments = input.nextLine();

        if (!isValidInput(segments)) {
            System.out.println("Invalid input. Must be exactly 7 digits of 0 or 1.");
            return;
        }
        boolean[] segmentState = getSegmentState(segments);
        String[] displayLines = buildDisplayLines(segmentState);
        printDisplay(displayLines);
    }

    public static boolean[] getSegmentState(String segments) {
        boolean[] state = new boolean[7];

        for (int index = 0; index < 7; index++) {
            state[index] = segments.charAt(index) == '1';
        }
        return state;
    }

    public static String[] buildDisplayLines(boolean[] segment) {

        String[] lines = new String[5];
        if (segment[0]) {
            lines[0] = " --- ";
        } else {
            lines[0] = "     ";
        }

        String lineOne = "";
        if (segment[5]) {
            lineOne += "|";
        } else {
            lineOne += " ";
        }
        lineOne += "   ";

        if (segment[1]) {
            lineOne += "|";
        } else {
            lineOne += " ";
        }

        lines[1] = lineOne;

        if (segment[6]) {
            lines[2] = " --- ";
        } else {
            lines[2] = "     ";
        }

        String lineThree = "";

        if (segment[4]) {
            lineThree += "|";
        } else {
            lineThree += " ";
        }

        lineThree += "   ";

        if (segment[2]) {
            lineThree += "|";
        } else {
            lineThree += " ";
        }

        lines[3] = lineThree;

        if (segment[3]) {
            lines[4] = " --- ";
        } else {
            lines[4] = "     ";
        }
        return lines;
    }
    public static void printDisplay(String[] lines) {

        for (int index = 0; index < lines.length; index++) {
            System.out.println(lines[index]);
        }
    }

    public static boolean isValidInput(String segments) {
        if (segments.length() != 7) {
            return false;
        }

        for (int index = 0; index < segments.length(); index++) {
            if (segments.charAt(index) != '0' && segments.charAt(index) != '1') {
                return false;
            }
        }
        return true;
    }
}
