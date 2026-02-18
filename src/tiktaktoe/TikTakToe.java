package tiktaktoe;

public class TikTakToe {
    public static void main(String[] args) {

        int[][] game = new int[3][3];
        display(game);

        char player = 'x';
        player = alternate(player);
        System.out.println("Next player: " + player);
    }

    public static void display(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("| " + array[row][column] + " ");
            }
            System.out.println("|");
        }
    }

    public static char alternate(char currentPlay) {
        if (currentPlay == 'x') {
            return 'o';
        }
        else {
            return 'x';
        }
    }
}
