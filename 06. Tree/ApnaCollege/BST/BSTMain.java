public class BSTMain {
    public static void main(String[] args) {
        // int[] values = { 5, 1, 3, 4, 2, 7 };
        int[] values = { 50, 30, 20, 40, 70, 60, 80 };
        BinarySearchTree tree = new BinarySearchTree();
        for (int i : values) {
            tree.insert(i);
            System.out.println("The value inserted : " + i);
        }
        tree.inOrder();
        System.out.println("Tree is balanced ? -> " + tree.isBalanced());
        System.out.println("Element Does exist in tree ? -> " +tree.search(20));
    }
}
