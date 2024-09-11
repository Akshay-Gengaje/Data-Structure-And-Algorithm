public class CircularQueue {
    private int[] arr;
    private static final int DEFAULT_SIZE = 5;
    private int front = 0, rear = 0, size = 0;

    // Constructor with default size
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    // Constructor with custom size
    public CircularQueue(int size) {
        this.arr = new int[size];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == arr.length;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Peek the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    // Enqueue operation
    public boolean enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot add new item");
            return false;
        }
        arr[rear] = item;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Can't remove items");
            return -1;
        }
        int removed = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return removed;
    }

    // Display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " <- ");
            i = (i + 1) % arr.length;
        }
        System.out.println("END");
    }
}
