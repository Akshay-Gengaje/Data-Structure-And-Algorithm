public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    static class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
            height = 1; // Initially, the height of the node is 1 (as it's a leaf node)
        }
    }

    // Helper method to get the height of a node
    int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // insertion
    public void insert(int value) {
        this.root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        // Update the height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));
        return root;
    }

    // Method to check if the tree is balanced
    boolean isBalanced() {
        return isBalancedRec(root);
    }

    // Helper method to check if the tree is balanced (recursive)
    boolean isBalancedRec(Node root) {
        if (root == null)
            return true; // An empty tree is balanced

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Check if the current node is balanced and recursively check its subtrees
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalancedRec(root.left) && isBalancedRec(root.right)) {
            return true;
        }
        return false;
    }

    // Treversal
    // In-order treversal L-ROOT-R

    public void inOrder() {
        System.out.print("In-order Treversal - ");
        inOrder(this.root);
        System.out.println();
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    // Search
    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node root, int value) {
        if (root == null) {
            return false; // Base case: the value is not found
        }
        if (value == root.value) {
            return true; // Base case: the value is found
        }
        if (value < root.value) {
            return search(root.left, value); // Search in the left subtree
        } else {
            return search(root.right, value); // Search in the right subtree
        }
    }

    // deletion of node
    // Deletion
    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node root, int value) {
        // Base case: if the root is null
        if (root == null) {
            return null;
        }

        // Recursively find the node to delete
        if (value < root.value) {
            root.left = delete(root.left, value);
        } else if (value > root.value) {
            root.right = delete(root.right, value);
        } else {
            // Node found - Handle the three cases

            // Case 1: Node with no children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Node with only one child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node with two children
            else {
                // Find the in-order successor (smallest in the right subtree)
                Node successor = findMin(root.right);

                // Replace the node's value with the successor's value
                root.value = successor.value;

                // Recursively delete the successor
                root.right = delete(root.right, successor.value);
            }
        }
        // Update the height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        return root;
    }

    // Helper method to find the smallest node (in-order successor)
    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
