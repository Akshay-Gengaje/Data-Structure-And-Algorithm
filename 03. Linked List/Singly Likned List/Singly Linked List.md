# Singly Linked List in Java

A Singly Linked List is a linear data structure where each element (node) points to the next element in the sequence. Each node contains two parts:

1. **Data**: Stores the value of the node.
2. **Next**: A reference (or pointer) to the next node in the list.

Here’s a simple diagram of a Singly Linked List:

```
Head
 |
 v
[Data | Next] -> [Data | Next] -> [Data | Next] -> NULL
```

### Java Implementation

Here’s a basic implementation of a Singly Linked List in Java:

```java
// Node class represents each node in the linked list
class Node {
    int data; // Data part
    Node next; // Reference to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// SinglyLinkedList class to manage the nodes
class SinglyLinkedList {
    Node head; // Head of the list

    // Constructor
    SinglyLinkedList() {
        this.head = null;
    }

    // Add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Print all nodes in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Delete a node with specific data
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);

        System.out.println("Linked List:");
        list.printList();

        list.delete(20);
        System.out.println("After deleting 20:");
        list.printList();
    }
}
```

### Advantages

1. **Dynamic Size**: The size of a linked list can grow or shrink as needed, making it more flexible in managing memory.
2. **Ease of Insertion/Deletion**: Inserting or deleting nodes does not require shifting elements, as in arrays. Operations are generally O(1) if the node reference is known.
3. **Efficient Memory Usage**: Memory is allocated only when needed, and there’s no pre-allocation of space as in arrays.

### Disadvantages

1. **Sequential Access**: Accessing elements is sequential, which can be slower compared to direct access in arrays. You must traverse the list to find an element.
2. **Extra Memory**: Each node requires additional memory for the next pointer, which can be significant if the list is large.
3. **No Random Access**: Unlike arrays, linked lists do not support random access, making operations like finding an element slower.

### When to Use

1. **When the number of elements is unknown** and can grow or shrink dynamically.
2. **When frequent insertions and deletions** are needed, especially at the beginning or middle of the list.
3. **When memory fragmentation is not a concern**, and memory overhead of pointers is acceptable.
4. **When sequential access is sufficient**, and random access is not required.

Singly Linked Lists are ideal for scenarios where dynamic data management is necessary, and the overhead of additional pointers is acceptable. For applications requiring fast access to elements by index, other data structures like arrays or doubly linked lists may be more appropriate.


Certainly! Let's add the time and space complexity analysis for the operations in a Singly Linked List:

### Time Complexity

1. **Insertion**:
   - **At the Beginning**: O(1) — You can directly insert a new node at the beginning of the list by updating the head pointer.
   - **At the End**: O(n) — You need to traverse the list to find the last node to append the new node.
   - **At a Specific Position**: O(n) — You need to traverse the list to find the position before the desired position.

2. **Deletion**:
   - **From the Beginning**: O(1) — If deleting the head node, you can simply update the head pointer.
   - **From the End**: O(n) — You need to traverse the list to find the second-to-last node to remove the last node.
   - **From a Specific Position**: O(n) — You need to traverse the list to find the node to delete and its previous node.

3. **Search**:
   - **Finding an Element**: O(n) — You need to traverse the list from the head to find the element.

4. **Access**:
   - **Accessing a Specific Element**: O(n) — You must traverse the list from the head to the specific index to access the element.

5. **Print/List Traversal**:
   - **Print all Elements**: O(n) — You need to visit each node once to print all elements.

### Space Complexity

1. **Node Storage**: O(n) — Each node requires space for the data and the reference to the next node. Therefore, the space complexity is proportional to the number of nodes in the list.

2. **Overall**: O(n) — The total space complexity is dominated by the number of nodes in the list, as each node contributes to the overall space requirement.

### Summary

- **Insertion**:
  - At the Beginning: O(1)
  - At the End: O(n)
  - At a Specific Position: O(n)

- **Deletion**:
  - From the Beginning: O(1)
  - From the End: O(n)
  - From a Specific Position: O(n)

- **Search**: O(n)

- **Access**: O(n)

- **Space Complexity**: O(n)

Singly Linked Lists are efficient for operations where you frequently add or remove elements, but less efficient when you need to access elements by index or perform operations that require traversing the list.