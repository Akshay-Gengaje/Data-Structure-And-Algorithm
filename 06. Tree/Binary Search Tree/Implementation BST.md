### What is a Binary Search Tree (BST)?

A **Binary Search Tree (BST)** is a binary tree where each node has the following properties:
1. **Left Subtree**: The left child of a node contains values smaller than the node's value.
2. **Right Subtree**: The right child of a node contains values greater than the node's value.
3. **No Duplicates**: Each element must be unique.

This structure allows for efficient searching, insertion, and deletion operations, with a time complexity of **O(log n)** in average cases (if the tree is balanced).

### Considerations when building a BST:
1. **Unique Elements**: Avoid inserting duplicate elements.
2. **Balancing**: A well-balanced tree improves performance. Without balancing, the tree can degrade into a linked list in the worst case, making operations **O(n)**.
3. **Comparison Logic**: While building a BST, you must compare values to determine the direction of traversal (left for smaller, right for greater).

---

### BST Operations
Let's define the structure of a BST in Java and implement the common methods like insertion, search, and traversal.

```java
// Node class to represent individual nodes in the BST
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

// Binary Search Tree class
class BinarySearchTree {
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Insert a value into the BST
    void insert(int value) {
        root = insertRec(root, value);
    }

    // Helper function for insertion (recursive)
    Node insertRec(Node root, int value) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Otherwise, recursively traverse the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        // Return the node pointer (unchanged in case of existing value)
        return root;
    }

    // Search for a value in the BST
    boolean search(int value) {
        return searchRec(root, value);
    }

    // Helper function for search (recursive)
    boolean searchRec(Node root, int value) {
        // Base cases: root is null (value not found) or value is present at root
        if (root == null) return false;
        if (root.value == value) return true;

        // Recursively search the left or right subtree
        if (value < root.value) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

    // In-order traversal (Left, Root, Right)
    void inOrder() {
        inOrderRec(root);
    }

    // Helper function for in-order traversal (recursive)
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }

    // Pre-order traversal (Root, Left, Right)
    void preOrder() {
        preOrderRec(root);
    }

    // Helper function for pre-order traversal (recursive)
    void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order traversal (Left, Right, Root)
    void postOrder() {
        postOrderRec(root);
    }

    // Helper function for post-order traversal (recursive)
    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.value + " ");
        }
    }
}
```

### Key Methods in a Binary Search Tree

1. **Insertion**
   - **Purpose**: Insert a new value into the BST at the correct position.
   - **Logic**: Compare the value with the current node. If smaller, move left; if larger, move right. If the spot is empty, place the new value there.

2. **Search**
   - **Purpose**: Search for a given value in the BST.
   - **Logic**: Traverse the tree by comparing the value with each node. If found, return true; otherwise, continue searching the left or right subtree based on comparison.

3. **Traversal Methods**
   - **In-Order Traversal (Left, Root, Right)**: This gives elements in sorted order for a BST.
   - **Pre-Order Traversal (Root, Left, Right)**: Used to copy the tree structure (serialization) and to list elements before processing the subtree.
   - **Post-Order Traversal (Left, Right, Root)**: Used to delete the tree or when you need to visit the children before processing the node.

---

### Usage Example

```java
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        // Inserting elements into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Searching for elements
        System.out.println("Is 40 in the tree? " + bst.search(40)); // true
        System.out.println("Is 90 in the tree? " + bst.search(90)); // false

        // Traversing the tree
        System.out.println("In-Order Traversal:");
        bst.inOrder(); // Output: 20 30 40 50 60 70 80

        System.out.println("\nPre-Order Traversal:");
        bst.preOrder(); // Output: 50 30 20 40 70 60 80

        System.out.println("\nPost-Order Traversal:");
        bst.postOrder(); // Output: 20 40 30 60 80 70 50
    }
}
```

### Explanation of Traversal Methods:
1. **In-Order Traversal**: Visits nodes in increasing order.
   - Example: For the above tree, the output is `20 30 40 50 60 70 80`.
   - Useful when you want sorted order of the elements.

2. **Pre-Order Traversal**: Visits the root first, then the left subtree, followed by the right subtree.
   - Example: The output is `50 30 20 40 70 60 80`.
   - Useful for copying the structure of the tree.

3. **Post-Order Traversal**: Visits the left subtree, then the right subtree, and finally the root.
   - Example: The output is `20 40 30 60 80 70 50`.
   - Useful for deleting or processing the entire subtree before visiting the node.

---

This implementation covers the core concepts of a **Binary Search Tree (BST)**, including how to build one, insert elements, search for values, and traverse the tree using in-order, pre-order, and post-order methods.