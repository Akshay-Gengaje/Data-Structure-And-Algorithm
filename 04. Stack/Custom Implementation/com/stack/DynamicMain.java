public class DynamicMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
