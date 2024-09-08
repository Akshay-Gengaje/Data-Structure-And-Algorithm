# In-built Queue - 
In Java, the Queue interface is part of the **Java Collections Framework** and provides an efficient way to implement the **queue** data structure without manually handling the complexities of array management. The Queue interface is located in the `java.util` package and is commonly implemented by classes like **LinkedList**, **PriorityQueue**, and **ArrayDeque**.

### Why Use Java Collections for Queue Implementation?

1. **Simplicity**: Using the Java Collections Framework (JCF) simplifies implementation by providing pre-built methods for enqueueing, dequeueing, and inspecting the queue.
2. **Flexibility**: The Queue interface has multiple implementations, such as `LinkedList`, `PriorityQueue`, and `ArrayDeque`, allowing you to choose the implementation that best fits your use case (e.g., regular queue vs. priority queue).
3. **Thread-Safety**: There are concurrent queue classes like `ConcurrentLinkedQueue` and `BlockingQueue` in the `java.util.concurrent` package for thread-safe operations in multi-threaded environments.
4. **Memory Management**: The collections framework automatically handles memory allocation, resizing, and garbage collection, making the queue implementation more efficient.

### Key Methods in the `Queue` Interface
- **add(E e)**: Inserts the specified element into the queue. Throws an exception if the queue is full (e.g., for bounded queues).
- **offer(E e)**: Inserts the specified element into the queue. Returns `false` if the queue is full (for bounded queues).
- **remove()**: Removes and returns the head of the queue. Throws `NoSuchElementException` if the queue is empty.
- **poll()**: Removes and returns the head of the queue. Returns `null` if the queue is empty.
- **element()**: Retrieves, but does not remove, the head of the queue. Throws `NoSuchElementException` if the queue is empty.
- **peek()**: Retrieves, but does not remove, the head of the queue. Returns `null` if the queue is empty.

### Common Queue Implementations in Java

1. **LinkedList**: Implements both the `List` and `Queue` interfaces. It is a doubly linked list and provides FIFO behavior when used as a queue.
   - Time Complexity: O(1) for `enqueue()` and `dequeue()`.
   - Recommended for: Regular queue usage when you need efficient insertion and deletion at both ends.

2. **PriorityQueue**: Implements a priority queue, where elements are ordered based on their priority. The head of the queue is the least element with respect to natural ordering or a provided comparator.
   - Time Complexity: O(log N) for insertion and deletion.
   - Recommended for: Scenarios where elements need to be processed in a specific order, not necessarily FIFO (e.g., task scheduling based on priority).

3. **ArrayDeque**: A resizable array implementation of the `Deque` interface, which supports both stack and queue operations. It is more efficient than `LinkedList` for both enqueueing and dequeuing elements.
   - Time Complexity: O(1) for most operations.
   - Recommended for: High-performance queue applications.

### Example: Implementing Queue with `LinkedList`

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer(10);  // returns true
        queue.offer(20);
        queue.offer(30);

        // Peek the front element
        System.out.println("Front element: " + queue.peek());  // Output: 10

        // Dequeue elements
        System.out.println("Dequeued: " + queue.poll());  // Output: 10
        System.out.println("Dequeued: " + queue.poll());  // Output: 20

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }

        // Final queue state
        System.out.println("Front element after dequeues: " + queue.peek());  // Output: 30
    }
}
```

### Example: Implementing Priority Queue

```java
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a Priority Queue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Enqueue elements (priority queue orders them naturally)
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        // Peek at the front element
        System.out.println("Front element: " + priorityQueue.peek());  // Output: 10

        // Dequeue elements (in sorted order)
        System.out.println("Dequeued: " + priorityQueue.poll());  // Output: 10
        System.out.println("Dequeued: " + priorityQueue.poll());  // Output: 20
    }
}
```

### Benefits of Using `PriorityQueue`
- **Natural Ordering**: Elements are ordered based on their natural ordering (or via a custom comparator).
- **Efficient Dequeue**: The element with the highest priority (or lowest if using natural ordering) is dequeued in O(log N) time.

### Example: Implementing Queue with `ArrayDeque`

```java
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create a Queue using ArrayDeque
        Queue<Integer> arrayDequeQueue = new ArrayDeque<>();

        // Enqueue elements
        arrayDequeQueue.offer(10);
        arrayDequeQueue.offer(20);
        arrayDequeQueue.offer(30);

        // Peek the front element
        System.out.println("Front element: " + arrayDequeQueue.peek());  // Output: 10

        // Dequeue elements
        System.out.println("Dequeued: " + arrayDequeQueue.poll());  // Output: 10
        System.out.println("Dequeued: " + arrayDequeQueue.poll());  // Output: 20

        // Final queue state
        System.out.println("Front element after dequeues: " + arrayDequeQueue.peek());  // Output: 30
    }
}
```

### Which Queue Implementation to Use?

- **`LinkedList`**: Use it when you need a simple FIFO structure without additional memory constraints, and when memory reallocation is not a concern.
- **`PriorityQueue`**: Use it when you need to process elements based on their priority rather than insertion order.
- **`ArrayDeque`**: Use it when you want a resizable array-based queue that is more efficient than `LinkedList`.

### Advantages of Using Java Collections for Queue
- **Predefined Operations**: You don’t need to write custom code for managing size, dynamic resizing, or bounds checking.
- **Thread-Safe Alternatives**: The Java Collections framework offers thread-safe implementations like `BlockingQueue` for concurrent applications.
- **Custom Implementations**: You can customize behavior using Comparators (in `PriorityQueue`) or choosing between different queue types (bounded vs unbounded).

Would you like more details on thread-safe queues like `BlockingQueue`, or need help with advanced queue operations?