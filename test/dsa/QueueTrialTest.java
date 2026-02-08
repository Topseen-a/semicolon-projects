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
    public void testThatOfferShouldAddElements() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        queue.offer("Beans");
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatPollShouldRemoveElementInFIFO_order() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        queue.offer("Beans");

        assertEquals("Rice", queue.poll());
        assertEquals("Beans", queue.poll());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatPeekShouldReturnFront() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        queue.offer("Beans");

        assertEquals("Rice", queue.peek());
    }

    @Test
    public void testThatPeekDoesNotRemoveElement() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        queue.offer("Beans");

        assertEquals("Rice", queue.peek());
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatQueueIsNotEmptyAfterOffer() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatSizeReducesAfterPoll() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        queue.offer("Beans");

        queue.poll();
        assertEquals(1, queue.size());
    }

    @Test
    public void testThatQueueBecomesEmptyAfterAllElementsAreRemoved() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        queue.offer("Beans");
        queue.offer("Egg");

        queue.poll();
        queue.poll();
        queue.poll();

        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatQueueMaintainsFIFOAfterMixedOperations() {
        assertTrue(queue.isEmpty());

        queue.offer("Rice");
        queue.offer("Beans");

        assertEquals("Rice", queue.poll());

        queue.offer("Egg");

        assertEquals("Beans", queue.poll());
        assertEquals("Egg", queue.poll());
    }

    @Test
    public void testThatInitialQueueSizeIsZero() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }
}
