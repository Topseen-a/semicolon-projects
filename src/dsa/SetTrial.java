package dsa;

public class SetTrial {
    private String[] elements;
    private int capacity;
    private int size = 0;

    public SetTrial(int capacity) {
        this.elements = new String[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean add(String item) {
        if (contains(item)) {
            return false;
        }
        if (size == capacity) {
            throw new IllegalArgumentException("Set is full");
        }
        elements[size++] = item;
        return true;
    }

    public boolean remove(String item) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(item)) {
                for (int count = index; count < size - 1; count++) {
                    elements[count] = elements[count + 1];
                }
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contains(String item) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(item)) {
                return true;
            }
        }
        return false;
    }
}
