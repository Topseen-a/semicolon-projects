package dsa;

public class StackTrial {
    private String[] stack;
    private int capacity;
    private int stackPosition = -1;

    public StackTrial(int capacity) {
        this.stack = new String[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return stackPosition == -1;
    }

    public boolean isFull() {
        return stackPosition == capacity - 1;
    }

    public String push(String item) {
        if (isFull()) {
            throw new IllegalArgumentException("Stack is full");
        } else {
            stack[++stackPosition] = item;
            return item;
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty, nothing to pop");
        } else {
            stack[stackPosition--] = null;
        }
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        } else {
             return stack[stackPosition];
        }
    }
}
