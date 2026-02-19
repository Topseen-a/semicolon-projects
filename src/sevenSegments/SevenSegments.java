package sevenSegments;

public class SevenSegments {
    public static void main(String[] args) {

        String input = "0110011";
        int[] segments = convertToArray(input);
        display(segments);
    }

    public static int[] convertToArray(String input) {
        int[] segments = new int[7];

        for (int index = 0; index < 7; index++) {
            segments[index] = input.charAt(index) - '0';
        }

        return segments;
    }

    public static void display(int[] s) {
        if (s[0] == 1) {
            System.out.println("#####");
        } else {
            System.out.println("     ");
        }

        if (s[5] == 1 && s[1] == 1) {
            System.out.println("#   #");
        } else if (s[5] == 1) {
            System.out.println("#    ");
        } else if (s[1] == 1) {
            System.out.println("    #");
        } else {
            System.out.println("     ");
        }

        if (s[6] == 1) {
            System.out.println("#####");
        } else {
            System.out.println("     ");
        }

        if (s[4] == 1 && s[2] == 1) {
            System.out.println("#   #");
        } else if (s[4] == 1) {
            System.out.println("#    ");
        } else if (s[2] == 1) {
            System.out.println("    #");
        } else {
            System.out.println("     ");
        }

        if (s[3] == 1) {
            System.out.println("#####");
        } else {
            System.out.println("     ");
        }
    }
}
