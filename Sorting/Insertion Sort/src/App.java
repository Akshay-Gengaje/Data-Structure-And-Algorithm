import java.util.Arrays;

public class App {

    public static int[] insertionSort(int[] arr) {
        // Get the length of the array
        int n = arr.length;
        // Iterate through the array, starting from the second element (index 1)
        for (int i = 1; i < n; ++i) {
            // Select the current element as the key to be inserted into the sorted portion
            int key = arr[i];

            // Initialize an index to traverse the sorted portion (elements to the left of
            // the key)
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            // This loop shifts elements to make space for the key in the correct position
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place the key in its correct position in the sorted portion
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 1, 7, 4, 8, 2, 11 };
        int[] sortedArray = insertionSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}
