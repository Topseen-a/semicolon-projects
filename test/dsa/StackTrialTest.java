package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTrialTest {

    StackTrial stack;

    @BeforeEach
    public void startWith() {
        stack = new StackTrial(4);
    }

    @Test
    public void testThatStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatPushAddItems() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");
        assertEquals("Rice", stack.peek());
    }

    @Test
    public void testThatStackIsNotEmptyAfterOnePush() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");

        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatPopRemovesTopItem() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");
        stack.push("Beans");
        stack.pop();
        assertEquals("Rice", stack.peek());
    }

    @Test
    public void testThatStackBecomesEmptyAfterPushAndPop() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void testLIFO_behavior() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");
        stack.push("Beans");
        stack.push("Stew");

        assertEquals("Stew", stack.peek());
        stack.pop();
        assertEquals("Beans", stack.peek());
        stack.pop();
        assertEquals("Rice", stack.peek());
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatStackIsNotFullBeforeCapacity() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");
        stack.push("Beans");

        assertFalse(stack.isFull());
    }

    @Test
    public void testThatPushEqualsCapacityThrowsException() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");
        stack.push("Beans");
        stack.push("Stew");
        stack.push("Egg");
        assertTrue(stack.isFull(), "Stack is full");
    }

    @Test
    public void testThatPushEqualsCapacityAndShouldNotBeEmpty() {
        assertTrue(stack.isEmpty());

        stack.push("Rice");
        stack.push("Beans");
        stack.push("Stew");
        stack.push("Egg");

        assertFalse(stack.isEmpty(), "Stack should not be empty now");
    }

    @Test
    public void testThatTopElementAtCapacityIsCorrect() {
        stack.push("Rice");
        stack.push("Beans");
        stack.push("Stew");
        stack.push("Egg");

        assertEquals("Egg", stack.peek());
    }
}
