public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertFirst(5);
        dl.insertFirst(4);
        dl.insertFirst(3);
        dl.insertFirst(2);
        dl.insertFirst(1);
        dl.insertLast(7);
        dl.insertAfter(7, 8);
        System.out.println("Printing Forward : ");
        dl.printForward();
        System.out.println("Printing Backward : ");
        dl.printBackward();
    }
}
