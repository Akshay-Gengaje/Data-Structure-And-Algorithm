### Queue Data Structure (In-depth Explanation)

#### What is a Queue?
A **queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle. This means the first element added to the queue will be the first one to be removed, similar to people waiting in a line. A queue allows insertions at the rear (enqueue) and deletions from the front (dequeue).

#### Main Operations in a Queue:
1. **enqueue(x)**: Adds an element `x` to the rear of the queue.
2. **dequeue()**: Removes the element from the front of the queue.
3. **peek()**: Returns the element at the front of the queue without removing it.
4. **isEmpty()**: Checks if the queue is empty.
5. **size()**: Returns the number of elements in the queue.

#### When to Use a Queue?
Queues are useful in situations where you need to process items in the same order they arrive:
- **Scheduling/Task Processing**: Queues are used in CPU task scheduling, where processes are executed in the order they arrive (like round-robin scheduling).
- **Breadth-First Search (BFS)**: In graph traversal, BFS uses a queue to explore nodes level by level.
- **Handling Requests**: Queues are used in handling tasks like printing jobs or web requests, where the first request made is the first to be served.

#### Why to Use a Queue?
- **Fair Order**: Since elements are processed in the order they arrive, queues are fair in handling tasks.
- **Efficiency**: A queue ensures constant time complexity for enqueuing and dequeuing operations, making it efficient for tasks that require sequential processing.
- **Separation of Responsibilities**: Enqueueing and dequeuing are done at different ends, ensuring clarity and a well-structured flow.

### Time and Space Complexity
| Operation    | Time Complexity | Space Complexity |
|--------------|-----------------|------------------|
| **enqueue()**| O(1)            | O(N)             |
| **dequeue()**| O(1)            | O(N)             |
| **peek()**   | O(1)            | O(N)             |
| **isEmpty()**| O(1)            | O(1)             |
| **size()**   | O(1)            | O(1)             |

Here, `N` represents the number of elements in the queue.

### Queue vs Other Data Structures (Comparison Table)

| Feature/Operation        | Queue (FIFO)    | Stack (LIFO)   | Array   | Linked List    |
|--------------------------|-----------------|----------------|---------|----------------|
| **Insertion**             | O(1) (enqueue)  | O(1) (push)    | O(1)    | O(1) (addLast) |
| **Deletion**              | O(1) (dequeue)  | O(1) (pop)     | O(N)    | O(1) (removeFirst) |
| **Access (Peek/Front)**   | O(1)            | O(1)           | O(1)    | O(N) (unsorted)|
| **Order**                 | FIFO            | LIFO           | Indexed| Sequential     |
| **Use Cases**             | Task scheduling, BFS | Recursion, Undo| Random access | Sequential operations|
| **Space Efficiency**      | O(N)            | O(N)           | O(N)    | O(N)           |

### Java Code Implementation

```java
import java.util.NoSuchElementException;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    // Constructor to initialize the queue
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Enqueue operation to add element at the rear
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
        }
    }

    // Dequeue operation to remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return value;
        }
    }

    // Peek operation to get the front element
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return queueArray[front];
        }
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Check if queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Return size of queue
    public int size() {
        return currentSize;
    }

    // Test the queue implementation
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create queue with capacity 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.peek());

        queue.enqueue(40);
        System.out.println("Front element after enqueuing 40: " + queue.peek());
    }
}
```

### Conclusion
- A queue is useful when tasks need to be processed in the order they arrive (FIFO).
- It offers constant time for core operations (enqueue, dequeue, peek).
- Queues are used in scenarios like scheduling tasks, breadth-first search, and request handling.

Would you like more examples or a deeper dive into any specific application of queues?