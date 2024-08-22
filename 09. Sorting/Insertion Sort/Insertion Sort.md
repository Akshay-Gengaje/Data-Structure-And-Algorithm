### Insertion Sort in Java

**Insertion Sort** is a simple sorting algorithm that builds the final sorted array one element at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, it is more efficient for small data sets or nearly sorted data.

**Algorithm**:
1. Start with the second element of the array (consider the first element as sorted).
2. Compare this element with the previous elements in the sorted part.
3. Shift all elements in the sorted part to the right if they are larger than the current element.
4. Insert the current element into its correct position in the sorted part.
5. Repeat the process for all elements in the array.

### Example and Diagram

Let's take an example array: `A = [5, 2, 9, 1, 5, 6]`.

1. **Initial Array**:
    - `[5, 2, 9, 1, 5, 6]`
    - The first element is considered sorted.

2. **Iteration 1** (Key = `2`):
    - Compare `2` with `5`.
    - Since `2` is less than `5`, shift `5` to the right and insert `2` at index `0`.
    - Result: `[2, 5, 9, 1, 5, 6]`

   ![Iteration 1](https://i.imgur.com/lje8wGu.png)

3. **Iteration 2** (Key = `9`):
    - Compare `9` with `5`.
    - Since `9` is greater than `5`, it remains in its place.
    - Result: `[2, 5, 9, 1, 5, 6]`

   ![Iteration 2](https://i.imgur.com/vYHXeTY.png)

4. **Iteration 3** (Key = `1`):
    - Compare `1` with `9`, `5`, and `2`.
    - Since `1` is less than all of them, shift them all to the right and insert `1` at index `0`.
    - Result: `[1, 2, 5, 9, 5, 6]`

   ![Iteration 3](https://i.imgur.com/RtE9MdL.png)

5. **Iteration 4** (Key = `5`):
    - Compare `5` with `9`.
    - Since `5` is less than `9` but greater than `2` and `5`, shift `9` to the right and insert `5` at index `3`.
    - Result: `[1, 2, 5, 5, 9, 6]`

   ![Iteration 4](https://i.imgur.com/LxLPlTb.png)

6. **Iteration 5** (Key = `6`):
    - Compare `6` with `9`.
    - Since `6` is less than `9` but greater than `5`, shift `9` to the right and insert `6` at index `4`.
    - Result: `[1, 2, 5, 5, 6, 9]`

   ![Iteration 5](https://i.imgur.com/Pf8Ec8h.png)

Now the array is fully sorted.

### Java Implementation

```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

### Explanation

1. **Outer Loop** (`for` loop): Iterates through the array from the second element (index `1`) to the end.
2. **Inner Loop** (`while` loop): Compares the key element with elements before it and shifts them to the right if they are greater.
3. **Insertion**: Once the correct position is found, the key element is placed in that position.

### Time Complexity
- **Worst-case**: `O(n^2)` (when the array is sorted in reverse order).
- **Best-case**: `O(n)` (when the array is already sorted).
- **Average-case**: `O(n^2)`.

### Space Complexity
- `O(1)` as it is an in-place sorting algorithm.

Insertion Sort is best used when the data is nearly sorted or when the dataset is small.