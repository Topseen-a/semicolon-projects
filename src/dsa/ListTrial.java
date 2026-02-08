package dsa;

public class ListTrial<E> {
    private Object[] elements;
    private int size = 0;
    private int capacity;

    public ListTrial(int capacity) {
        this.elements = new Object[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean add(E item) {
        if (size == capacity) {
            throw new IllegalArgumentException("List is full");
        }
        elements[size++] = item;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        E removed = (E) elements[index];

        for (int count = index; count < size - 1; count++) {
            elements[count] = elements[count + 1];
        }
        elements[--size] = null;
        return removed;
    }
}
