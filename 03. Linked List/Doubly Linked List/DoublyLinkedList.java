public class DoublyLinkedList {
    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = null;
        }
        head = node;
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, DoublyLinkedList.Node prev, DoublyLinkedList.Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }
}
