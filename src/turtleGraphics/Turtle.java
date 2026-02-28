package turtleGraphics;

public class Turtle {

    private boolean penIsUp = true;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle() {
        currentDirection = Direction.EAST;
        currentPosition = new Position(0,0);
    }

    public boolean penIsUp() {
        return penIsUp;
    }

    public void movePenDown() {
        penIsUp = false;
    }

    public void movePenUp() {
        penIsUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int steps, SketchPad sketchPad) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int index = 0; index < steps; index++) {
            switch(currentDirection) {
                case EAST -> column++;
                case WEST -> column--;
                case SOUTH -> row++;
                case NORTH -> row--;
            }

            checkBoundary(row, column);
            if (!penIsUp) {
                sketchPad.markPosition(row, column);
            }
        }
        currentPosition = new Position(row, column);
    }

    private void checkBoundary(int row, int column) {
        if (row < 0 || row > 19 || column < 0 || column > 19) {
            throw new IllegalArgumentException("Turtle cannot leave 20x20 sketchpad boundary");
        }
    }
}
