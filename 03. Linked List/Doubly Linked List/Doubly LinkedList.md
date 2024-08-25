### Doubly Linked List Overview

A **Doubly Linked List (DLL)** is a type of linked list where each node contains three components:

1. **Data**: The actual value stored in the node.
2. **Next Pointer**: A reference to the next node in the sequence.
3. **Previous Pointer**: A reference to the previous node in the sequence.

This structure allows traversal in both forward and backward directions, making operations like insertion and deletion more efficient in certain scenarios compared to a singly linked list.



<img title="" src="https://media.geeksforgeeks.org/wp-content/uploads/20240318150717/Doubly-Linked-List-in-Data-Structure.webp" alt="What are real life examples of Double Linked List? - GeeksforGeeks" data-align="center" style="zoom:100%;">

### Structure of a Node in Doubly Linked List

```java
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
```

### Basic Operations on a Doubly Linked List

1. **Insertion**
2. **Deletion**
3. **Traversal**
4. **Search**

### 1. Insertion Operation

#### a. Insert at the Beginning

**Algorithm**:

1. Create a new node.
2. Make the new node's next pointer point to the current head.
3. If the head is not null, set the current head's previous pointer to the new node.
4. Set the new node as the head.

**Code**:

```java
void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;

    if (head != null) {
        head.prev = newNode;
    }

    head = newNode;
}
```

#### b. Insert at the End

**Algorithm**:

1. Create a new node.
2. Traverse to the last node.
3. Make the last node's next pointer point to the new node.
4. Set the new node's previous pointer to the last node.

**Code**:

```java
void insertAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }

    Node last = head;
    while (last.next != null) {
        last = last.next;
    }

    last.next = newNode;
    newNode.prev = last;
}
```

#### c. Insert After a Given Node

**Algorithm**:

1. Create a new node.
2. Set the new node's next pointer to the given node's next.
3. Set the new node's previous pointer to the given node.
4. If the next node is not null, set its previous pointer to the new node.
5. Set the given node's next pointer to the new node.

**Code**:

```java
void insertAfter(Node prevNode, int data) {
    if (prevNode == null) {
        System.out.println("The given previous node cannot be null.");
        return;
    }

    Node newNode = new Node(data);
    newNode.next = prevNode.next;
    newNode.prev = prevNode;

    if (newNode.next != null) {
        newNode.next.prev = newNode;
    }

    prevNode.next = newNode;
}
```

### 2. Deletion Operation

#### a. Delete a Node

**Algorithm**:

1. If the node to be deleted is the head, set the head to the next node.
2. If the node to be deleted is not the last node, set the next node's previous pointer to the node's previous pointer.
3. If the node to be deleted is not the first node, set the previous node's next pointer to the node's next pointer.

**Code**:

```java
void deleteNode(Node delNode) {
    if (head == null || delNode == null) {
        return;
    }

    if (head == delNode) {
        head = delNode.next;
    }

    if (delNode.next != null) {
        delNode.next.prev = delNode.prev;
    }

    if (delNode.prev != null) {
        delNode.prev.next = delNode.next;
    }

    delNode = null;  // Free the memory
}
```

### 3. Traversal Operation

**Algorithm**:

- **Forward Traversal**: Start from the head node and move using the next pointers.
- **Backward Traversal**: Start from the last node and move using the previous pointers.

**Code**:

```java
void traverseForward() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}

void traverseBackward() {
    Node last = head;
    while (last.next != null) {
        last = last.next;
    }

    while (last != null) {
        System.out.print(last.data + " ");
        last = last.prev;
    }
    System.out.println();
}
```

### 4. Search Operation

**Algorithm**:

- Traverse through the list until the data is found or the end of the list is reached.

**Code**:

```java
Node search(int key) {
    Node current = head;
    while (current != null && current.data != key) {
        current = current.next;
    }
    return current;  // Returns null if not found
}
```

### Time Complexity Analysis

| Operation                  | Time Complexity |
| -------------------------- | --------------- |
| Insertion at the Beginning | O(1)            |
| Insertion at the End       | O(n)            |
| Insertion after a Node     | O(1)            |
| Deletion of a Node         | O(1)            |
| Forward Traversal          | O(n)            |
| Backward Traversal         | O(n)            |
| Search                     | O(n)            |

### Conclusion

Doubly linked lists provide more flexibility for certain operations compared to singly linked lists, especially when it comes to bidirectional traversal. However, they require additional memory to store the previous pointer in each node.
