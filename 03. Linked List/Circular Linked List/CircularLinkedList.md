# Circular Linked List -

A **Circular Linked List** is a variation of the linked list where the last node points back to the first node, forming a circle. It can either be **singly circular** or **doubly circular**, based on whether the nodes contain a reference to only the next node or both the next and previous nodes.

### Key Features:

1. **Circular Nature**: The last node points back to the first node. In the case of a singly circular linked list, the last node's `next` pointer references the first node instead of `null`. This circular connection allows traversing the entire list starting from any node.
2. **No End Node**: Since the list is circular, there's no node with a `null` reference, unlike a regular linked list where the last node has a `null` reference.

### Types:

1. **Singly Circular Linked List**: Each node has a pointer to the next node, and the last node points to the first node.
2. **Doubly Circular Linked List**: Each node has two pointers, one pointing to the next node and one to the previous node. The last node points to the first node, and the first node’s `previous` pointer points to the last node.

### Structure:

```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

In a **Circular Singly Linked List**, you modify the last node to point to the head:

```java
class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Adding a node to the circular linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Pointing tail to head to form the circle
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Keeping the circle intact
        }
    }

    // Displaying nodes
    public void display() {
        Node current = head;
        if (head != null) {
            do {
                System.out.println(current.data);
                current = current.next;
            } while (current != head); // Continue till we reach the head again
        }
    }
}
```

### Operations:

1. **Insertion**:

   - Insertion at the beginning: Update the new node's `next` pointer to point to the head, and update the tail’s `next` pointer to the new head.
   - Insertion at the end: Insert a new node after the current tail, and update the tail’s `next` pointer to point to the head.

2. **Traversal**:

   - Start from any node and continue moving through the list by following the `next` pointer. Stop when you return to the starting node.

3. **Deletion**:
   - Deleting a node from the list involves adjusting the `next` pointer of the preceding node. Care must be taken to update the `tail` and `head` references when deleting at the start or end.

### Advantages:

1. **Efficient Traversal**: Since it's circular, you can traverse the list starting from any node and return to the same node.
2. **No Null Check**: Unlike a normal linked list, where the last node has `null` as its next reference, in a circular list you never have to worry about null pointers while traversing.

### Disadvantages:

1. **Complexity**: The circular structure can make insertions and deletions at the end or beginning more complex because of the need to maintain the circular connections.
2. **Infinite Loops**: If not handled carefully, traversing the list can lead to an infinite loop, as the traversal doesn’t end unless you explicitly check for the head node.

Circular linked lists are often used in scenarios where the list is meant to be repeatedly traversed, such as in round-robin scheduling or buffer management.
