import java.util.Scanner;

public class BinaryTree {
    private Node root;

    // Constructor to create an empty tree
    public BinaryTree() {
        root = null;
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void printPretty(Node root, int space) {
        // Base case
        if (root == null) {
            return;
        }

        // Increase distance between levels
        space += 5;

        // Process right child first
        printPretty(root.right, space);

        // Print current node after space count
        System.out.println();
        for (int i = 5; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(root.value);
        printPretty(root.left, space);
    }

    public void displayTree() {
        printPretty(root, 0);
    }

}