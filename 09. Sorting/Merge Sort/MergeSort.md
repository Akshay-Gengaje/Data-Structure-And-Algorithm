### Merge Sort Explained

**Merge Sort** is a divide-and-conquer algorithm. It works by recursively splitting an array into two halves until each half contains a single element, and then merging the halves back together in a sorted order. The merging process ensures that the resultant array is sorted.

#### Steps:
1. **Divide:** Split the array into two halves recursively.
2. **Conquer:** Recursively sort the two halves.
3. **Merge:** Merge the two sorted halves back into a single sorted array.

#### Time Complexity:
- **Best case:** O(n log n)
- **Average case:** O(n log n)
- **Worst case:** O(n log n)

#### Space Complexity:
- O(n), due to the auxiliary space used in the merging process.

### Merge Sort Algorithm

#### 1. **Splitting the Array:**
The array is split recursively into two halves until each half contains a single element.

#### 2. **Merging Two Sorted Halves:**
Once the array is split, the merge step takes two sorted arrays and combines them into a single sorted array.

### Merge Sort Code in Java

```java
import java.util.Arrays;

public class MergeSort {
    
    // Main function that sorts the array using Merge Sort
    public static void mergeSort(int[] array) {
        // Base case: if the array has 1 or 0 elements, it's already sorted
        if (array.length < 2) {
            return;
        }

        // Find the middle of the array
        int mid = array.length / 2;
        
        // Split the array into two halves
        int[] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(array, mid, array.length);

        // Recursively sort each half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge the sorted halves
        merge(array, leftHalf, rightHalf);
    }

    // Function to merge two sorted arrays into a single sorted array
    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;

        // Traverse both halves and merge them in sorted order
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k++] = leftHalf[i++];
            } else {
                array[k++] = rightHalf[j++];
            }
        }

        // Copy remaining elements of leftHalf, if any
        while (i < leftHalf.length) {
            array[k++] = leftHalf[i++];
        }

        // Copy remaining elements of rightHalf, if any
        while (j < rightHalf.length) {
            array[k++] = rightHalf[j++];
        }
    }

    // Test the Merge Sort algorithm
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
```

### Explanation of the Code:
1. **`mergeSort` function:** This recursively splits the array into two halves and sorts them.
2. **`merge` function:** This merges two sorted arrays (left and right halves) into a single sorted array.
3. **Base Case:** If the array length is less than 2, the function returns because an array with 0 or 1 element is already sorted.

### Example:
Given the array `{12, 11, 13, 5, 6, 7}`, the array is split and sorted as follows:
- `{12, 11, 13, 5, 6, 7}` → `{12, 11, 13}` and `{5, 6, 7}`
- `{12, 11, 13}` → `{12}` and `{11, 13}` → Merge → `{11, 12, 13}`
- `{5, 6, 7}` → No split needed, already sorted.
- Merge `{11, 12, 13}` and `{5, 6, 7}` → Result: `{5, 6, 7, 11, 12, 13}`

This approach guarantees that the array is sorted efficiently with a time complexity of O(n log n).

### Key Advantages and Disadvantages

#### Advantages:

1. **Predictable Performance:** It always guarantees O(n log n) time complexity.
2. **Stable Sort:** Maintains the relative order of equal elements.
3. **Efficient for Linked Lists:** Merge sort is particularly efficient when sorting linked lists because it doesn't require random access.
4. **Useful for External Sorting:** When dealing with large datasets that don't fit into memory, merge sort is preferred as it can efficiently sort data from disk.

#### Disadvantages:

1. **Memory Usage:** It uses extra space, making it less memory-efficient compared to in-place algorithms like quicksort.
2. **Slower in Practice:** For smaller datasets, algorithms like quicksort or insertion sort may be faster due to lower overhead.

### When to Use Merge Sort?

- When stable sorting is required.
- When sorting linked lists, where merge sort excels.
- For large datasets that need to be sorted on disk (external sorting).

### Conclusion

Merge sort is an efficient, stable sorting algorithm that works well with large datasets or when stability is required. Its O(n log n) time complexity makes it faster than simpler sorting algorithms like bubble sort or insertion sort, but its higher space complexity can be a disadvantage in memory-constrained environments.
