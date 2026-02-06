package dsa;

import java.util.Stack;

public class StackTrial {
    private Stack<String> stack;

    public StackTrial() {
        this.stack = new Stack<>();
    }

    public boolean isEmpty() {
        return stack.empty();
    }

    public void addItem(String item) {
        stack.push(item);
    }

    public String checkItem() {
        return stack.peek();
    }

    public String removeItem(String beans) {
        return stack.pop();
    }
}
