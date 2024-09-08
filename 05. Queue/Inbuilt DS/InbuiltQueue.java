import java.util.*;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.add(12);
        queue.add(15);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
