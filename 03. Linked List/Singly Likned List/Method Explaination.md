# Singly Linked List Methods Explained

This document explains the methods in the `SinglyLinkedList` class, providing insights into their purpose, implementation, and time complexity.

## 1. `insertFirst(int value)`

```java
public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;
    if (tail == null) {
        tail = head;
    }
    size += 1;
}
```

### **Explanation**

- **Purpose**: Inserts a new node at the beginning of the linked list.
- **Why We Did It**: Adding elements at the start of the list is a common operation, particularly in cases where you need to quickly prepend data.
- **How It Works**:
  - A new `Node` is created and its `next` pointer is set to the current `head`.
  - The `head` pointer is updated to the new node.
  - If the list was previously empty, the `tail` is also set to this new node.
- **Time Complexity**: O(1) - The operation is constant time since it only involves updating a few pointers.

## 2. `insertLast(int value)`

```java
public void insertLast(int value) {
    Node node = new Node(value);
    if (tail == null) {
        this.insertFirst(value);
        return;
    }
    tail.next = node;
    tail = node;
    size += 1;
}
```

### **Explanation**

- **Purpose**: Inserts a new node at the end of the linked list.
- **Why We Did It**: Adding elements at the end is necessary for implementing queues or appending elements sequentially.
- **How It Works**:
  - A new `Node` is created.
  - If the list is empty, `insertFirst` is called.
  - Otherwise, the current `tail` node’s `next` pointer is updated to the new node.
  - The `tail` pointer is then updated to the new node.
- **Time Complexity**: O(1) - Efficient due to direct access to the `tail`.

## 3. `insertByIndex(int index, int value)`

```java
public void insertByIndex(int index, int value) {
    if (index < 0 || index > size) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if (index == 0) {
        this.insertFirst(value);
        return;
    }
    if (index == size) {
        this.insertLast(value);
        return;
    }
    Node temp = head;
    for (int i = 1; i < index; i++) {
        temp = temp.next;
    }
    Node newNode = new Node(value, temp.next);
    temp.next = newNode;
    size++;
}
```

### **Explanation**

- **Purpose**: Inserts a node at a specific index in the list.
- **Why We Did It**: Inserting at a specific position is crucial for maintaining order or inserting elements in a sorted manner.
- **How It Works**:
  - The method checks if the index is valid.
  - If the index is `0`, `insertFirst` is called. If the index is equal to `size`, `insertLast` is called.
  - Otherwise, the list is traversed to the specified index, and a new node is inserted by adjusting the `next` pointers.
- **Time Complexity**: O(n) - The time complexity depends on the position where the new node is inserted, as traversal is needed.

## 4. `deleteFirst()`

```java
public int deleteFirst() {
    if (size == 0) {
        throw new IllegalStateException("List is empty");
    }
    int val = this.head.value;
    this.head = this.head.next;
    if (this.head == null) {
        this.tail = null;
    }
    size--;
    return val;
}
```

### **Explanation**

- **Purpose**: Deletes the first node in the list and returns its value.
- **Why We Did It**: Removing the first element is common in scenarios like dequeuing or popping from a stack.
- **How It Works**:
  - The method checks if the list is empty.
  - It stores the value of the `head` node, updates the `head` to point to the next node, and decrements the size.
  - If the list becomes empty, the `tail` is also set to `null`.
- **Time Complexity**: O(1) - The operation is very efficient as it only involves reassigning pointers.

## 5. `deleteByIndex(int index)`

```java
public int deleteByIndex(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if (index == 0) {
        return deleteFirst();
    }
    if (index == size - 1) {
        return deleteLast();
    }
    Node prev = getItemByIndex(index - 1);
    int val = prev.next.value;
    prev.next = prev.next.next;
    size--;
    return val;
}
```

### **Explanation**

- **Purpose**: Deletes a node at a specific index and returns its value.
- **Why We Did It**: Removing elements at a specific index is useful when dealing with ordered data or when specific conditions are met.
- **How It Works**:
  - The method checks if the index is valid.
  - If the index is `0`, `deleteFirst` is called; if it's the last index, `deleteLast` is called.
  - Otherwise, the list is traversed to the node just before the specified index, and the node at the index is removed by updating the `next` pointer.
- **Time Complexity**: O(n) - The time complexity depends on the position of the node to be deleted.

## 6. `deleteLast()`

```java
public int deleteLast() {
    if (size <= 1) {
        return deleteFirst();
    }
    Node secondLast = getItemByIndex(size - 2);
    int val = tail.value;
    tail = secondLast;
    tail.next = null;
    size--;
    return val;
}
```

### **Explanation**

- **Purpose**: Deletes the last node in the list and returns its value.
- **Why We Did It**: Useful in stack-like operations where the last element needs to be removed.
- **How It Works**:
  - If the list has only one element, `deleteFirst` is called.
  - Otherwise, the list is traversed to the second last node, the `tail` is updated to this node, and its `next` pointer is set to `null`.
- **Time Complexity**: O(n) - This operation requires traversal to the second last node, making it less efficient than `deleteFirst`.

## 7. `getItemByIndex(int index)`

```java
public Node getItemByIndex(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    Node node = head;
    for (int i = 0; i < index; i++) {
        node = node.next;
    }
    return node;
}
```

### **Explanation**

- **Purpose**: Retrieves the node at a specific index.
- **Why We Did It**: Accessing a node by index is necessary for various operations like insertion, deletion, or simply accessing data.
- **How It Works**:
  - The method starts at the `head` and traverses the list until the specified index is reached.
  - The node at that index is returned.
- **Time Complexity**: O(n) - The time complexity depends on the index, as traversal is required.

## 8. `find()`

```java
    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp; // Return the node if the value matches
            }
            temp = temp.next;
        }
        return null; // Return null if the value is not found
    }
```

### **Explanation**

- **Purpose**:The find method searches the list for the first node that contains a specific value.
- **Implementation**:
  It starts at the head and iterates through the list.
  If it finds a node with the given value, it returns that node.
  If it reaches the end of the list without finding the value, it returns null.
- **Time Complexity**: The time complexity is O(n), where n is the number of elements in the list, because in the worst case, the method needs to check each element.

## 9. `display()`

```java
public void display() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.value + " -> ");
        temp = temp.next;
    }
    System.out.println("END");
}
```

### **Explanation**

- **Purpose**: Prints the entire linked list in a readable format.
- **Why We Did It**: Visualizing the contents of the list is essential for debugging and understanding the current state of the list.
- **How It Works**:
  - The method starts at the `head` and traverses the entire list, printing the value of each node followed by an arrow (`->`).
  - The traversal stops when the `temp` node is `null`, indicating the end of the list.
- **Time Complexity**: O(n) - The operation involves traversing the entire list, making it linear in complexity.

---

This explanation covers the purpose, implementation, and time complexity of each method, providing a comprehensive understanding of the `SinglyLinkedList` class.
