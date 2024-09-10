public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean enqueue(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        int removed = data[0];
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        return data[0];
    }

    public boolean isFull() {
        return end == this.data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
