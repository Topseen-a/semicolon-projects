package tictactoe;

import java.sql.SQLOutput;

public class TicTacToe {
    public static void main(String[] args) {

        String[][] gameOne = {
                {"x", "o", "x"},
                {"o", "x", "o"},
                {"x", "o", "x"}
        };

        for (int row = 0; row < gameOne.length; row++) {
            for (int column = 0; column < gameOne[row].length; column++) {
                System.out.print(gameOne[row][column]);
            }
            System.out.println(" ");
        }
        System.out.println();

        int [][] gameTwo = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        for (int row = 0; row < gameTwo.length; row++) {
            for (int column = 0; column < gameTwo[row].length; column++) {
                System.out.print(gameTwo[row][column]);
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
