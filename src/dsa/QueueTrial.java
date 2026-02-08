package dsa;

public class QueueTrial {
    private String[] queue;
    private int size = 0;
    private int capacity;
    private int front = 0;
    private int back = -1;

    public QueueTrial(int capacity) {
        this.queue = new String[capacity];
        this.capacity = capacity;

    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(String item) {
        if (size == capacity) {
            throw new IllegalArgumentException("Queue is full");
        }
        back++;
        queue[back] = item;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        String removed = queue[front];
        front++;
        size--;
        return removed;
    }

    public String peek() {
        if (size == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return queue[front];
    }
}
