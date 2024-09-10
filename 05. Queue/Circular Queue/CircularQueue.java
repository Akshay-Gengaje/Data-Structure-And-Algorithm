public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = data.length;
    private int front = -1;
    private int rear = -1;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return front == (rear + 1) % size;
    }

    public boolean isEmpty() {
        return rear = -1;
    }
}
