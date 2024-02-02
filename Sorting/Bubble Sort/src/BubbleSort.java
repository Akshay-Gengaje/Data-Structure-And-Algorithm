import java.util.Arrays;

public class BubbleSort{
    public static int[] bubbleSort(int[] arr) {
        int numElements = arr.length;
        for (int rounds = 0; rounds < numElements - 1; rounds++) {
            boolean swapped = false;
            for (int passes = 0; passes < numElements - rounds - 1; passes++) {
                if (arr[passes] > arr[passes + 1]) {
                    swapped = true;
                    int temp = arr[passes];
                    arr[passes] = arr[passes + 1];
                    arr[passes + 1] = temp;
                }
            }
            if (!swapped) {
                System.out.println("Total rounds performed: " + rounds);
                return arr;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10,1,7,6,14,9};
//        int[] arr = {1,2,3,4,5,6};
       int[] sortedArray =  bubbleSort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(sortedArray));
    }
}