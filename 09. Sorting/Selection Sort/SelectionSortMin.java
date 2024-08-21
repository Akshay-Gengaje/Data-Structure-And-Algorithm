import java.util.Arrays;

public class SelectionSortMin {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 20 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinIndex(arr, i, arr.length - 1);
            swap(arr, i, minIndex);
        }
    }

    static int getMinIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i < end; i++) {
            if (arr[i + 1] < arr[i]) {
                min = i + 1;
            }
        }
        return min;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
