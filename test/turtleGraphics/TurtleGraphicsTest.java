package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {

    Turtle ijapa;
    SketchPad sketchPad;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
        sketchPad = new SketchPad(20);
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

    @Test
    public void testThatTurtleCanMoveForwardFacingEastWithPenDown() {
        assertTrue(ijapa.penIsUp());
        ijapa.movePenDown();
        ijapa.moveForward(5, sketchPad);
        assertEquals(0, ijapa.getCurrentPosition().getRow());
        assertEquals(5, ijapa.getCurrentPosition().getColumn());

        assertEquals(1, sketchPad.getFloor()[0][1]);
        assertEquals(1, sketchPad.getFloor()[0][5]);
    }

    @Test
    public void testThatTurtleCanMoveForwardFacingSouthWithPenDown() {
        assertTrue(ijapa.penIsUp());
        ijapa.movePenDown();
        ijapa.moveForward(5, sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(5, sketchPad);
        assertEquals(5, ijapa.getCurrentPosition().getRow());
        assertEquals(5, ijapa.getCurrentPosition().getColumn());

        assertEquals(1, sketchPad.getFloor()[0][1]);
        assertEquals(1, sketchPad.getFloor()[0][5]);
    }

    @Test
    public void testThatTurtleCanMoveForwardFacingWestWithPenDown() {
        assertTrue(ijapa.penIsUp());
        ijapa.movePenDown();
        ijapa.moveForward(5, sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(5,  sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(5,  sketchPad);
        assertEquals(5, ijapa.getCurrentPosition().getRow());
        assertEquals(0, ijapa.getCurrentPosition().getColumn());

        assertEquals(1, sketchPad.getFloor()[0][1]);
        assertEquals(1, sketchPad.getFloor()[0][5]);
    }

    @Test
    public void testThatTurtleCanMoveForwardFacingNorthWithPenDown() {
        assertTrue(ijapa.penIsUp());
        ijapa.movePenDown();
        ijapa.moveForward(5, sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(5, sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(5, sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(5,  sketchPad);
        assertEquals(0, ijapa.getCurrentPosition().getRow());
        assertEquals(0, ijapa.getCurrentPosition().getColumn());

        assertEquals(1, sketchPad.getFloor()[0][1]);
        assertEquals(1, sketchPad.getFloor()[0][5]);
    }

    @Test
    public void testThatTurtleCannotMoveMoreThan_20_stepsWhenFacingAnyDirection() {
        assertTrue(ijapa.penIsUp());
        ijapa.movePenDown();
        assertThrows(IllegalArgumentException.class, () -> {ijapa.moveForward(50, sketchPad);});
    }
}
