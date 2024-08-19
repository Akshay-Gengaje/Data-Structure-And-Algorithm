import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 12, 8, 21, 34, 7, 19, 45, 16, 23 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int pass = 0; pass < arr.length - 1; pass++) {
            swapped = false;
            for (int comp = 0; comp < arr.length - pass - 1; comp++) {
                // Swap if greater
                if (arr[comp] > arr[comp + 1]) {
                    int temp = arr[comp];
                    arr[comp] = arr[comp + 1];
                    arr[comp + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, array is already sorted
            if (!swapped)
                break;
        }
    }
}
