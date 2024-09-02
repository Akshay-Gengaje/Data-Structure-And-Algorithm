public class DoublyLinkedList {
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        // Create a new node.
        Node node = new Node(val);
        // If the list is empty, make the new node the head.
        if (head == null) {
            head = node;
            return;
        }
        Node last = head;
        // Otherwise, traverse to the last node and make its next point to the new node.
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        // Make the new node's prev point to the last node.
        node.prev = last;
    }

    public void insertAfter(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Does not exist!");
            return;
        }
        Node newNode = new Node(val);
        newNode.prev = p;
        newNode.next = p.next;
        if (newNode.next != null) {
            p.next.prev = newNode;
        }
        p.next = newNode;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void printForward() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END \n");
    }

    public void printBackward() {
        if (head == null)
            return;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }
}
