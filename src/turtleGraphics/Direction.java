package turtleGraphics;

public enum Direction {
    EAST("SOUTH", "NORTH"),
    SOUTH("WEST", "EAST"),
    WEST("NORTH", "SOUTH"),
    NORTH("EAST", "WEST");

    private String right;
    private String left;

    Direction(String right, String left) {
        this.right = right;
        this.left = left;
    }

    public Direction turnRight() {
        return Direction.valueOf(right);
    }

    public Direction turnLeft() {
        return switch (this) {
            case EAST -> NORTH;
            case NORTH -> WEST;
            case WEST -> SOUTH;
            case SOUTH -> EAST;
        };
    }
}
