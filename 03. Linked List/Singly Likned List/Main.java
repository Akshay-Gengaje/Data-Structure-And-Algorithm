public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        // list.insertFirst(10);
        // list.insertFirst(20);
        // list.insertFirst(30);
        // list.insertFirst(40);
        // list.insertFirst(50);
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.dispaly();
        System.out.println("size : " + list.getSize());
    }
}
