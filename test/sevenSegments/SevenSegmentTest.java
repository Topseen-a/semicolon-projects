package sevenSegments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentTest {

    @Test
    public void testValidInput() {
        assertTrue(SevenSegment.isValidInput("1111011"));
    }

    @Test
    public void testInvalidLength() {
        assertFalse(SevenSegment.isValidInput("111"));
    }

    @Test
    public void testInvalidCharacters() {
        assertFalse(SevenSegment.isValidInput("11110a1"));
    }

    @Test
    public void testGetSegmentState() {
        boolean[] expected = {true, true, true, true, false, true, true};
        boolean[] actual = SevenSegment.getSegmentState("1111011");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBuildDisplayLines() {

        boolean[] input = {true, true, true, true, false, true, true};
        String[] expected = {
                " --- ",
                "|   |",
                " --- ",
                "    |",
                " --- "
        };
        String[] actual = SevenSegment.buildDisplayLines(input);
        assertArrayEquals(expected, actual);
    }
}
