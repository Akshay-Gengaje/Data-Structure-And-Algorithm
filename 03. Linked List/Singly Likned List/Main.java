public class Main {
    public static void main(String[] args) {
        // Create a new Singly Linked List
        SinglyLinkedList list = new SinglyLinkedList();

        // Test insertFirst method
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        System.out.println("After inserting 30, 20, 10 at the start:");
        list.display(); // Expected Output: 30 -> 20 -> 10 -> END

        // Test insertLast method
        list.insertLast(40);
        list.insertLast(50);
        System.out.println("After inserting 40, 50 at the end:");
        list.display(); // Expected Output: 30 -> 20 -> 10 -> 40 -> 50 -> END

        // Test insertByIndex method
        list.insertByIndex(2, 25);
        System.out.println("After inserting 25 at index 2:");
        list.display(); // Expected Output: 30 -> 20 -> 25 -> 10 -> 40 -> 50 -> END

        // Test deleteFirst method
        int deletedFirst = list.deleteFirst();
        System.out.println("After deleting first element (" + deletedFirst + "):");
        list.display(); // Expected Output: 20 -> 25 -> 10 -> 40 -> 50 -> END

        // Test deleteLast method
        int deletedLast = list.deleteLast();
        System.out.println("After deleting last element (" + deletedLast + "):");
        list.display(); // Expected Output: 20 -> 25 -> 10 -> 40 -> END

        // Test deleteByIndex method
        int deletedByIndex = list.deleteByIndex(1);
        System.out.println("After deleting element at index 1 (" + deletedByIndex + "):");
        list.display(); // Expected Output: 20 -> 10 -> 40 -> END

        // Test getItemByIndex method
        SinglyLinkedList.Node node = list.getItemByIndex(1);
        System.out.println("Element at index 1: " + node.value); // Expected Output: 10

        // Final display of the list
        System.out.println("Final state of the list:");
        list.display(); // Expected Output: 20 -> 10 -> 40 -> END
    }
}
