public class Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display(); // Output: 10 <- 20 <- 30 <- 40 <- 50 <- END

        cq.dequeue();
        cq.dequeue();

        cq.display(); // Output: 30 <- 40 <- 50 <- END

        System.out.println(cq.peek());
    }
}
