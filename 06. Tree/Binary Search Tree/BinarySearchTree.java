// Height difference between any two nodes on same level should be less than or equal to 1

public class BinarySearchTree {
    public class Node {
        private int value;
        private Node left, right;
        private int height;

        Node(int item) {
            this.value = item;
            this.height = 0; // Initialize leaf node height as 0
        }

        public int getValue() {
            return this.value;
        }
    }

    private Node root;

    public BinarySearchTree() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1; // Return -1 if the node is null (this handles leaf nodes)
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Display the BinarySearchTree
    public void display() {
        display(root, "Root Node -> ");
    }

    private void display(Node node, String details) {
        if (node == null) { // Check if node is null before accessing its value
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "This is left child of " + node.getValue() + " : ");
        display(node.right, "This is right child of " + node.getValue() + " : ");
    }
    
    // Inserting Elements in the BinarySearchTree
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value); // Base case: create a new node if we hit a null spot
        }
        if (value < node.value) {
            node.left = insert(value, node.left); // Recur on the left subtree
        } else if (value > node.value) {
            node.right = insert(value, node.right); // Recur on the right subtree
        }

        // Update height of the current node after inserting
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node; // Return the node (updated)
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true; // An empty tree is considered balanced
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

        // Convert a sorted array into a balanced BST
        public void sortedArrayToBST(int[] nums) {
            root = sortedArrayToBST(nums, 0, nums.length - 1);
        }
    
        private Node sortedArrayToBST(int[] nums, int start, int end) {
            if (start > end) {
                return null; // Base case: empty array
            }
            // Find the middle element and make it the root
            int mid = (start + end) / 2;
            Node node = new Node(nums[mid]);
    
            // Recursively build the left and right subtrees
            node.left = sortedArrayToBST(nums, start, mid - 1);
            node.right = sortedArrayToBST(nums, mid + 1, end);
    
            // Update the height of the node
            node.height = Math.max(height(node.left), height(node.right)) + 1;
    
            return node;
        }
}