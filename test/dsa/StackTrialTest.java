package dsa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTrialTest {

    @Test
    public void testThatStackIsEmptyAtInitial() {
        StackTrial stack = new StackTrial();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatAddItemWorks() {
        StackTrial stack = new StackTrial();
        assertTrue(stack.isEmpty());

        stack.addItem("Rice");
        assertEquals("Rice", stack.checkItem());
    }

    @Test
    public void testThatRemoveItemsWOrk() {
        StackTrial stack = new StackTrial();
        assertTrue(stack.isEmpty());

        stack.addItem("Rice");
        stack.addItem("Beans");
        stack.addItem("Fufu");
        assertEquals("Fufu", stack.removeItem("Rice"));
    }
}
