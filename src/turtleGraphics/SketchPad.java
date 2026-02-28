package turtleGraphics;

public class SketchPad {
    private int[][] floor;

    public SketchPad(int size) {
        floor = new int[size][size];
    }

    public int[][] getFloor() {
        return floor;
    }

    public void markPosition(int row, int column) {
        floor[row][column] = 1;
    }

    public void display() {
        for (int[] row : floor) {
            for (int cell : row) {
                if (cell == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
