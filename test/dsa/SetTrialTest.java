package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTrialTest {

    SetTrial setTrial;

    @BeforeEach
    public void startWith() {
        setTrial = new SetTrial(4);
    }

    @Test
    public void testThatSetIsEmpty() {
        assertTrue(setTrial.isEmpty());
    }

    @Test
    public void testThatAdd_addsElementsToSet() {
        assertTrue(setTrial.isEmpty());

        assertTrue(setTrial.add("Rice"));
        assertTrue(setTrial.add("Beans"));

        assertEquals(2, setTrial.size());
    }

    @Test
    public void testThatAdd_addsUpToCapacity() {
        assertTrue(setTrial.isEmpty());

        assertTrue(setTrial.add("Rice"));
        assertTrue(setTrial.add("Beans"));
        assertTrue(setTrial.add("Stew"));
        assertTrue(setTrial.add("Egg"));

        assertEquals(4, setTrial.size());
    }

    @Test
    public void testThatAddDuplicateReturnsFalse() {
        assertTrue(setTrial.isEmpty());

        assertTrue(setTrial.add("Rice"));
        assertFalse(setTrial.add("Rice"));
        assertEquals(1, setTrial.size());
    }

    @Test
    public void testThatRemove_removeElementFromSet() {
        assertTrue(setTrial.isEmpty());

        setTrial.add("Rice");
        setTrial.add("Beans");

        assertTrue(setTrial.remove("Rice"));
        assertEquals(1, setTrial.size());
    }

    @Test
    public void testThatRemoveShiftsNothingButSizeDecreases() {
        assertTrue(setTrial.isEmpty());

        setTrial.add("Rice");
        setTrial.add("Beans");
        setTrial.add("Stew");

        setTrial.remove("Beans");
        assertEquals(2, setTrial.size());
    }

    @Test
    public void testThatRemoveNonExistingElementReturnsFalse() {
        assertTrue(setTrial.isEmpty());

        setTrial.add("Rice");
        assertFalse(setTrial.remove("Beans"));
        assertEquals(1, setTrial.size());
    }

    @Test
    public void testThatSetIsEmptyAfterAddAndRemove() {
        assertTrue(setTrial.isEmpty());

        setTrial.add("Rice");
        assertFalse(setTrial.isEmpty());

        setTrial.remove("Rice");
        assertTrue(setTrial.isEmpty());
    }

    @Test
    public void testThatContainsWorkAsItShould() {
        setTrial.add("Rice");
        setTrial.add("Beans");

        assertTrue(setTrial.contains("Rice"));
        assertFalse(setTrial.contains("Stew"));
    }


}
