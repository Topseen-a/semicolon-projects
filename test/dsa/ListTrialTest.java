package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTrialTest {

    ListTrial<String> stringListTrial;

    @BeforeEach
    public void startWith() {
        stringListTrial = new ListTrial<>(4);
    }

    @Test
    public void testThatStringListIsEmpty() {
        assertTrue(stringListTrial.isEmpty());
    }

    @Test
    public void testThatAdd_addsElementsToListAndConfirmsSize() {
        assertTrue(stringListTrial.isEmpty());

        stringListTrial.add("Rice");
        stringListTrial.add("Beans");
        assertEquals("Rice", stringListTrial.get(0));
        assertEquals("Beans", stringListTrial.get(1));
        assertEquals(2, stringListTrial.size());
    }

    @Test
    public void testThatRemove_removesElementsFromListAndConfirmSize() {
        assertTrue(stringListTrial.isEmpty());

        stringListTrial.add("Rice");
        stringListTrial.add("Beans");
        assertEquals("Rice", stringListTrial.remove(0));
        assertEquals(1, stringListTrial.size());
    }

    @Test
    public void testThatAddUpToCapacityWorksCorrectly() {
        assertTrue(stringListTrial.isEmpty());

        stringListTrial.add("Rice");
        stringListTrial.add("Beans");
        stringListTrial.add("Stew");
        stringListTrial.add("Egg");

        assertEquals(4, stringListTrial.size());
        assertEquals("Egg", stringListTrial.get(3));
    }

    @Test
    public void testThatIsEmptyAndSizeUpdateCorrectly() {
        assertTrue(stringListTrial.isEmpty());

        stringListTrial.add("Rice");
        assertFalse(stringListTrial.isEmpty());
        assertEquals(1, stringListTrial.size());

        stringListTrial.remove(0);
        assertTrue(stringListTrial.isEmpty());
        assertEquals(0, stringListTrial.size());
    }

    @Test
    public void testThatRemoveMovesElementsLeft() {
        assertTrue(stringListTrial.isEmpty());

        stringListTrial.add("Rice");
        stringListTrial.add("Beans");
        stringListTrial.add("Stew");

        stringListTrial.remove(1);
        assertEquals("Rice", stringListTrial.get(0));
        assertEquals("Stew", stringListTrial.get(1));
        assertEquals(2, stringListTrial.size());
    }

    @Test
    public void testThatAddAfterRemoveOccupiesSpace() {
        assertTrue(stringListTrial.isEmpty());

        stringListTrial.add("Rice");
        stringListTrial.add("Beans");
        stringListTrial.remove(0);
        stringListTrial.add("Stew");

        assertEquals("Beans", stringListTrial.get(0));
        assertEquals("Stew", stringListTrial.get(1));
        assertEquals(2, stringListTrial.size());
    }

    @Test
    public void testThatSizeUpdatesCorrectly() {
        assertTrue(stringListTrial.isEmpty());
        assertEquals(0, stringListTrial.size());

        stringListTrial.add("Rice");
        assertEquals(1, stringListTrial.size());

        stringListTrial.add("Beans");
        assertEquals(2, stringListTrial.size());
    }

    @Test
    public void testThatAddAllowsDuplicateElements() {
        assertTrue(stringListTrial.isEmpty());

        stringListTrial.add("Rice");
        stringListTrial.add("Rice");

        assertEquals("Rice", stringListTrial.get(0));
        assertEquals("Rice", stringListTrial.get(1));
        assertEquals(2, stringListTrial.size());
    }
}
