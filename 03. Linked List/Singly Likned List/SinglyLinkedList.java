public class SinglyLinkedList {
    private Node head; // Points to the first node in the list
    private Node tail; // Points to the last node in the list
    private int size;  // Keeps track of the number of elements in the list

    public SinglyLinkedList() {
        this.size = 0;
    }

    // Node class representing each element in the linked list
    public class Node {
        int value;   // The value stored in this node
        Node next;   // The next node in the list

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Insert a node at the beginning of the list
    // Time Complexity: O(1)
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) { // If the list was empty, tail should also point to the new node
            tail = head;
        }
        size += 1;
    }

    // Insert a node at the end of the list
    // Time Complexity: O(1)
    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            this.insertFirst(value); // If the list is empty, insert the first node
            return;
        }
        tail.next = node; // Link the last node to the new node
        tail = node;      // Update tail to the new node
        size += 1;
    }

    // Insert a node at a specific index in the list
    // Time Complexity: O(n) - in the worst case, where n is the index
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

    // Delete the first node of the list
    // Time Complexity: O(1)
    public int deleteFirst() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int val = this.head.value;
        this.head = this.head.next;
        if (this.head == null) { // If the list becomes empty, tail should be null as well
            this.tail = null;
        }
        size--;
        return val;
    }

    // Delete the node at a specific index
    // Time Complexity: O(n) - in the worst case, where n is the index
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

    // Delete the last node of the list
    // Time Complexity: O(n) - since we need to traverse to the second last node
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

    // Get the node at a specific index
    // Time Complexity: O(n) - in the worst case, where n is the index
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

    // Display the list
    // Time Complexity: O(n)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
