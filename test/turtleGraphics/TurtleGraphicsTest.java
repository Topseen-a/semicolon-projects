package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {

    Turtle ijapa;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
    }

    @Test
    public void testThatTurtlePenIsUp() {
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void testThatTurtlePenCanMoveDown() {
        assertTrue(ijapa.penIsUp());
        ijapa.movePenDown();
        assertFalse(ijapa.penIsUp());
    }

    @Test
    public void testThatTurtlePenCanMoveUp() {
        assertTrue(ijapa.penIsUp());
        ijapa.movePenDown();
        ijapa.movePenUp();
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingEast() {
        assertTrue(ijapa.penIsUp());
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingSouth() {
        assertTrue(ijapa.penIsUp());
        ijapa.turnRight();
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingWest() {
        assertTrue(ijapa.penIsUp());
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingNorth() {
        assertTrue(ijapa.penIsUp());
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingEast() {
        assertTrue(ijapa.penIsUp());
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(Direction.NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingNorth() {
        assertTrue(ijapa.penIsUp());
        ijapa.turnLeft();
        assertEquals(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingWest() {
        assertTrue(ijapa.penIsUp());
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingSouth() {
        assertTrue(ijapa.penIsUp());
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
    }
}
