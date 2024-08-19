import java.util.Arrays;
import java.util.Scanner;

public class OrderedSort {
    public static void main(String[] args) {
        int[] array = { 5, 12, 8, 21, 34, 7, 19, 45, 16, 23 };
        Scanner sc = new Scanner(System.in);
        System.out.println("How to sort array? Press Number \n 1. Ascending 2. Descending");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                orderedBubbleSort(array, "asc");
                System.out.println(
                        "Array sorted in Ascending order: " + Arrays.toString(array));
                break;
            case 2:
                Arrays.sort(array);
                orderedBubbleSort(array, "desc");
                System.out.println(
                        "Array sorted in Descending order: " + Arrays.toString(array));
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

    }

    static void orderedBubbleSort(int[] arr, String order) {
        for (int pass = 0; pass < arr.length; pass++) {
            boolean swapped = false;
            for (int comp = 0; comp < arr.length - pass - 1; comp++) {
                if (order.equals("asc")) {
                    // Swap if element is greater than next element
                    if (arr[comp] > arr[comp + 1]) {
                        int temp = arr[comp];
                        arr[comp] = arr[comp + 1];
                        arr[comp + 1] = temp;
                        swapped = true;
                    }
                } else if (order.equals("desc")) {
                    // swap if element is less than next element
                    if (arr[comp] < arr[comp + 1]) {
                        int temp = arr[comp];
                        arr[comp] = arr[comp + 1];
                        arr[comp + 1] = temp;
                        swapped = true;
                    }
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}
