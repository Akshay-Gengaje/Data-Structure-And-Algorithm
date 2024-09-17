class BinarySearchTree {
    Node root;

    public BinarySearchTree() {

    }

    private class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int getHeight() {
            return height;
        }
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.getHeight();
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node : ");
    }

    private void display(Node node, String details) {
        if (node == null)
            return;
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public void insert(int value) {
        insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null)
            return new Node(value);
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    public int calculateHeight(Node node) {
        if (node == null)
            return -1;
        // Recursively calculate the height of left and right subtrees
        int left = calculateHeight(node);
        int right = calculateHeight(node);
        return Math.max(left, right) + 1;
    }

}