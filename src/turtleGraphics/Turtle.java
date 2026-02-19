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


}
