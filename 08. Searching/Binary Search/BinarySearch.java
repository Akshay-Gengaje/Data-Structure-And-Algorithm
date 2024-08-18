public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int target = -12;
        int result = BinarySearch(arr, target);
        System.out.println(result);
    }

    // return the index
    // return -1 if not found
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // int mid = start - end / 2; This can exceed the int limit
            int mid = start + (end - start) / 2;
            // if target < mid then shift end to left
            if (target < arr[mid]) {
                end = mid - 1;
            }
            // if target > mid then shift start to right
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // found the target
            }
        }
        return -1; // Element not found in the array
    }
}
