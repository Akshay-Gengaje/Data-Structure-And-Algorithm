import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] selectionSort(int[] arr){
        // initially the unsorted array start for 0 th index
        for(int i =0; i < arr.length - 1; i++){
            System.out.println("Iteration Number : "+ i);
            int minIndex = i;
            // Iterating over unsorted Array to find min index
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            // Swap the found minimum element with the first element of the unsorted part
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                System.out.println(i + "th element " +arr[i]+ " swapped with " + minIndex + " th index element " + arr[minIndex]);
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
    int[] arr = {13,46,24,52,20,9};
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        int[] sortedArr = selectionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArr));
    }
}