### Stack Data Structure (In-depth Explanation)

#### What is a Stack?
A **stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle. This means that the last element added to the stack will be the first one to be removed. It can be visualized as a pile of items, where only the top item is accessible.

#### Main Operations in a Stack:
1. **push(x)**: Adds an element `x` to the top of the stack.
2. **pop()**: Removes the element from the top of the stack.
3. **peek()**: Returns the element at the top of the stack without removing it.
4. **isEmpty()**: Checks if the stack is empty.
5. **size()**: Returns the number of elements in the stack.

#### When to Use a Stack?
Stacks are ideal in scenarios where you need to manage data in a LIFO manner:
- **Recursion**: Function call stacks are managed using a stack, as each function call is added to the stack, and on returning, they are removed.
- **Expression Evaluation and Parsing**: For handling operations like balanced parentheses, evaluating postfix expressions, and parsing.
- **Backtracking Problems**: In algorithms where we explore possible solutions and backtrack, stacks are useful to store intermediate states (like depth-first search).
- **Undo Mechanism**: Applications such as text editors use stacks to store user actions to implement undo functionality.

#### Why to Use a Stack?
- **Simple and Efficient**: Stacks provide efficient operations with constant time complexity for `push`, `pop`, and `peek`.
- **Memory Management**: Managing recursive function calls, which are based on a stack structure, ensures correct memory allocation for each function call.

### Time and Space Complexity
| Operation    | Time Complexity | Space Complexity |
|--------------|-----------------|------------------|
| **push()**   | O(1)            | O(N)             |
| **pop()**    | O(1)            | O(N)             |
| **peek()**   | O(1)            | O(N)             |
| **isEmpty()**| O(1)            | O(1)             |
| **size()**   | O(1)            | O(1)             |

Here, `N` is the number of elements in the stack.

### Stack vs Other Data Structures (Comparison Table)

| Feature/Operation        | Stack (LIFO)    | Queue (FIFO)   | Array   | Linked List    |
|--------------------------|-----------------|----------------|---------|----------------|
| **Insertion**             | O(1) (push)     | O(1) (enqueue) | O(1)    | O(1) (addFirst)|
| **Deletion**              | O(1) (pop)      | O(1) (dequeue) | O(N)    | O(1) (removeFirst)|
| **Access (Peek/Front)**   | O(1)            | O(1)           | O(1)    | O(N) (unsorted) |
| **Order**                 | LIFO            | FIFO           | Indexed| Sequential     |
| **Use Cases**             | Recursion, Undo | Scheduling, BFS| Random access | Sequential operations|
| **Space Efficiency**      | O(N)            | O(N)           | O(N)    | O(N)           |

### Java Code Implementation

```java
import java.util.EmptyStackException;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is empty
    }

    // Push operation to add element
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop operation to remove element
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation to get top element
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top];
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Return size of stack
    public int size() {
        return top + 1;
    }

    // Test the stack implementation
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create stack with capacity 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());

        stack.push(40);
        System.out.println("Top element after pushing 40: " + stack.peek());
    }
}
```

### Conclusion
- A stack is a versatile data structure suitable for use in situations requiring LIFO order.
- It offers constant time for core operations (push, pop, peek).
- Compared to arrays and linked lists, the stack simplifies memory management in recursion and backtracking algorithms.

Would you like more details on any part of the stack, or examples of specific use cases?