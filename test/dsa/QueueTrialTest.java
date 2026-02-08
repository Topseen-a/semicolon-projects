package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTrialTest {

    QueueTrial queue;

    @BeforeEach
    public void startWith() {
        queue = new QueueTrial(3);
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatEnqueueShouldAddElements() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");
        queue.enqueue("Beans");
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatDequeueShouldRemoveElementInFIFO_order() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");
        queue.enqueue("Beans");

        assertEquals("Rice", queue.dequeue());
        assertEquals("Beans", queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatPeekShouldReturnFront() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");
        queue.enqueue("Beans");

        assertEquals("Rice", queue.peek());
    }

    @Test
    public void testThatPeekDoesNotRemoveElement() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");
        queue.enqueue("Beans");

        assertEquals("Rice", queue.peek());
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatQueueIsNotEmptyAfterEnqueue() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");

        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
    }

    @Test
    public void testThatSizeReducesAfterDequeue() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");
        queue.enqueue("Beans");

        queue.dequeue();

        assertEquals(1, queue.size());
    }

    @Test
    public void testThatQueueBecomesEmptyAfterAllElementsAreRemoved() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");
        queue.enqueue("Beans");
        queue.enqueue("Egg");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testThatQueueMaintainsFIFOAfterMixedOperations() {
        assertTrue(queue.isEmpty());

        queue.enqueue("Rice");
        queue.enqueue("Beans");

        assertEquals("Rice", queue.dequeue());

        queue.enqueue("Egg");

        assertEquals("Beans", queue.dequeue());
        assertEquals("Egg", queue.dequeue());
    }

    @Test
    public void testThatInitialQueueSizeIsZero() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }
}
