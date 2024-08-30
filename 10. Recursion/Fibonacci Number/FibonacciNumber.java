public class FibonacciNumber {
    public static void main(String[] args) {
        int sum = fibonacci(6);
        System.out.println(sum);
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
