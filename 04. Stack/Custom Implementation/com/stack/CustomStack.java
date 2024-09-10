public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return false;
        }
        ptr++;
        this.data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can not pop from an empty stack!");
        }
        int removed = this.data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can not peek from an empty stack!");
        }
        return this.data[ptr];
    }

    public boolean isFull() {
        return ptr == this.data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

}
