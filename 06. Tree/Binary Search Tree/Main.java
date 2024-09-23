public class Main {
    public static void main(String[] args) {
        // int[] arr = { 15, 10, 7, 5, 24, 30, 22 };
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BinarySearchTree tree = new BinarySearchTree();
        // tree.populate(arr);
        tree.sortedArrayToBST(arr);
        tree.display();
        System.out.println(tree.balanced());
    }
}
