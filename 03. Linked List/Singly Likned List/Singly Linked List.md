# Singly Linked List Implementation in Java

## Overview

This project is a basic implementation of a **Singly Linked List** in Java. A linked list is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element, known as a node, contains a value and a reference (or pointer) to the next node in the sequence. This makes linked lists dynamic in nature, allowing for efficient insertion and deletion of elements without the need to shift other elements, unlike arrays.
![alt text](image.png)
## What is a Linked List?

A **Linked List** is a collection of nodes where each node contains two parts:
1. **Data**: The value stored in the node.
2. **Pointer**: A reference to the next node in the sequence.

In a **Singly Linked List**, each node points to the next node, and the last node points to `null`, indicating the end of the list. The list is managed by two main pointers:
- **Head**: Points to the first node of the list.
- **Tail**: Points to the last node of the list.

### Key Concepts of Linked List

- **Dynamic Size**: Unlike arrays, linked lists do not have a fixed size. They can grow and shrink dynamically as elements are added or removed.
- **Efficient Insertions/Deletions**: Insertions and deletions are more efficient than arrays, as there is no need to shift elements.
- **Sequential Access**: Linked lists are not indexed, so accessing elements requires traversing the list from the head to the desired node.

## When to Use a Linked List?

Use a linked list when:
- You need dynamic memory allocation where the size can change frequently.
- Insertion and deletion operations are more frequent, and their performance is critical.
- Memory overhead isn't an issue since linked lists use extra memory for pointers.
- You need a data structure that allows efficient sequential access.

Avoid using a linked list when:
- Random access is required, as accessing elements in a linked list is slower compared to arrays (O(n) vs. O(1)).
- Memory is a concern, as each node in a linked list requires additional memory for the pointer.

## Methods Explained with Time Complexity

### `insertFirst(int value)`
- **Description**: Inserts a new node at the beginning of the list.
- **Time Complexity**: O(1) - Insertion at the head is constant time since we directly update the head pointer and link the new node.

### `insertLast(int value)`
- **Description**: Inserts a new node at the end of the list.
- **Time Complexity**: O(1) - Insertion at the tail is constant time as we maintain a reference to the last node (tail), which is updated directly.

### `insertByIndex(int index, int value)`
- **Description**: Inserts a new node at a specific index in the list.
- **Time Complexity**: O(n) - In the worst case, where n is the index. This requires traversal to the index position, which takes linear time.

### `deleteFirst()`
- **Description**: Deletes the first node of the list and returns its value.
- **Time Complexity**: O(1) - Deletion at the head is constant time since we directly update the head pointer to the next node.

### `deleteLast()`
- **Description**: Deletes the last node of the list and returns its value.
- **Time Complexity**: O(n) - In the worst case, where n is the size of the list, since we need to traverse to the second last node to update the tail pointer.

### `deleteByIndex(int index)`
- **Description**: Deletes the node at a specific index and returns its value.
- **Time Complexity**: O(n) - In the worst case, where n is the index. This requires traversal to the index position, which takes linear time.

### `getItemByIndex(int index)`
- **Description**: Retrieves the node at a specific index.
- **Time Complexity**: O(n) - In the worst case, where n is the index. This requires traversal to the index position, which takes linear time.

### `display()`
- **Description**: Prints out the entire linked list in a readable format.
- **Time Complexity**: O(n) - Where n is the number of nodes in the list. Each node is accessed sequentially.

## Time Complexity Summary

| Operation           | Time Complexity |
|---------------------|-----------------|
| Insert at Beginning | O(1)            |
| Insert at End       | O(1)            |
| Insert at Index     | O(n)            |
| Delete from Beginning | O(1)          |
| Delete from End     | O(n)            |
| Delete from Index   | O(n)            |
| Access by Index     | O(n)            |
| Traversal           | O(n)            |

## Space Complexity

| Operation           | Space Complexity |
|---------------------|------------------|
| Insert at Beginning | O(1)             |
| Insert at End       | O(1)             |
| Insert at Index     | O(1)             |
| Delete from Beginning | O(1)           |
| Delete from End     | O(1)             |
| Delete from Index   | O(1)             |
| Access by Index     | O(1)             |
| Traversal           | O(1)             |

## Comparison with Other Data Structures

| Feature              | Array    | Singly Linked List | Doubly Linked List | Stack   | Queue   |
|----------------------|----------|--------------------|--------------------|---------|---------|
| Memory Allocation    | Contiguous | Non-contiguous    | Non-contiguous    | Non-contiguous | Non-contiguous |
| Access Time          | O(1)     | O(n)               | O(n)               | O(n)    | O(n)    |
| Insertion Time       | O(n)     | O(1) at beginning  | O(1) at beginning/end | O(1)    | O(1)    |
| Deletion Time        | O(n)     | O(1) at beginning  | O(1) at beginning/end | O(1)    | O(1)    |
| Dynamic Size         | No       | Yes                | Yes                | Yes     | Yes     |
| Memory Overhead      | Low      | High (due to pointers) | Higher (two pointers) | High (due to pointers) | High (due to pointers) |
| Sequential Access    | No       | Yes                | Yes                | Yes     | Yes     |
| Random Access        | Yes      | No                 | No                 | No      | No      |

## Conclusion

The Singly Linked List is a fundamental data structure that offers efficient insertions and deletions, especially in scenarios where the size of the data changes frequently. However, it comes with trade-offs in terms of access time and memory overhead due to the need for pointers. Understanding when and how to use linked lists effectively is crucial in optimizing the performance of your programs.

## How to Use

1. Clone the repository to your local machine.
2. Open the project in your favorite IDE.
3. Compile and run the `SinglyLinkedList` class to see the implementation in action.

Feel free to explore and modify the code to better understand how linked lists work!

---

This README file now provides detailed explanations of each method in the `SinglyLinkedList` class, including their time complexities, and offers a comprehensive understanding of how linked lists compare to other data structures.