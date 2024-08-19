# Bubble Sort

**Bubble Sort** is a simple comparison-based sorting algorithm. It works by repeatedly stepping through the list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. This process is repeated until the list is sorted.

The name "Bubble Sort" comes from the way the larger elements "bubble" to the top of the list with each pass.

### How Bubble Sort Works

1. **Starting from the first element**, compare the current element with the next element.
2. If the current element is greater than the next element, **swap them**.
3. Move to the next element and repeat the process until the end of the array is reached.
4. The largest element is now at the last position.
5. Repeat the process for the remaining elements, excluding the last sorted elements.
6. Continue this process until the array is completely sorted.

### Example

Consider the following array:

```
[5, 2, 9, 1, 5, 6]
```

**Step-by-Step Bubble Sort Process:**

**Pass 1:**

- Compare 5 and 2: Swap since 5 > 2 → `[2, 5, 9, 1, 5, 6]`
- Compare 5 and 9: No swap since 5 < 9 → `[2, 5, 9, 1, 5, 6]`
- Compare 9 and 1: Swap since 9 > 1 → `[2, 5, 1, 9, 5, 6]`
- Compare 9 and 5: Swap since 9 > 5 → `[2, 5, 1, 5, 9, 6]`
- Compare 9 and 6: Swap since 9 > 6 → `[2, 5, 1, 5, 6, 9]`

Now, 9 is in its correct position.

**Pass 2:**

- Compare 2 and 5: No swap since 2 < 5 → `[2, 5, 1, 5, 6, 9]`
- Compare 5 and 1: Swap since 5 > 1 → `[2, 1, 5, 5, 6, 9]`
- Compare 5 and 5: No swap since 5 = 5 → `[2, 1, 5, 5, 6, 9]`
- Compare 5 and 6: No swap since 5 < 6 → `[2, 1, 5, 5, 6, 9]`

Now, 6 is in its correct position.

**Pass 3:**

- Compare 2 and 1: Swap since 2 > 1 → `[1, 2, 5, 5, 6, 9]`
- Compare 2 and 5: No swap since 2 < 5 → `[1, 2, 5, 5, 6, 9]`
- Compare 5 and 5: No swap since 5 = 5 → `[1, 2, 5, 5, 6, 9]`

Now, 5 is in its correct position.

**Pass 4:**

- Compare 1 and 2: No swap since 1 < 2 → `[1, 2, 5, 5, 6, 9]`
- Compare 2 and 5: No swap since 2 < 5 → `[1, 2, 5, 5, 6, 9]`

The array is now sorted.

### Diagrammatic Representation

```plaintext
Initial Array:    [5, 2, 9, 1, 5, 6]

Pass 1:
Step 1: Compare 5 and 2 → Swap → [2, 5, 9, 1, 5, 6]
Step 2: Compare 5 and 9 → No Swap → [2, 5, 9, 1, 5, 6]
Step 3: Compare 9 and 1 → Swap → [2, 5, 1, 9, 5, 6]
Step 4: Compare 9 and 5 → Swap → [2, 5, 1, 5, 9, 6]
Step 5: Compare 9 and 6 → Swap → [2, 5, 1, 5, 6, 9]

Pass 2:
Step 1: Compare 2 and 5 → No Swap → [2, 5, 1, 5, 6, 9]
Step 2: Compare 5 and 1 → Swap → [2, 1, 5, 5, 6, 9]
Step 3: Compare 5 and 5 → No Swap → [2, 1, 5, 5, 6, 9]
Step 4: Compare 5 and 6 → No Swap → [2, 1, 5, 5, 6, 9]

Pass 3:
Step 1: Compare 2 and 1 → Swap → [1, 2, 5, 5, 6, 9]
Step 2: Compare 2 and 5 → No Swap → [1, 2, 5, 5, 6, 9]
Step 3: Compare 5 and 5 → No Swap → [1, 2, 5, 5, 6, 9]

Pass 4:
Step 1: Compare 1 and 2 → No Swap → [1, 2, 5, 5, 6, 9]
Step 2: Compare 2 and 5 → No Swap → [1, 2, 5, 5, 6, 9]

Sorted Array:    [1, 2, 5, 5, 6, 9]
```

### Bubble Sort in Java

```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

### Key Points

1. **Time Complexity:** 
   
   - Worst-case: O(n^2)
   - Best-case: O(n) (when the array is already sorted)
   - Average-case: O(n^2)

2. **Space Complexity:** O(1) (In-place sorting)

3. **Stability:** Bubble Sort is a stable sort; it maintains the relative order of equal elements.

Bubble Sort is generally not suitable for large datasets due to its O(n^2) time complexity, but it's a great introduction to sorting algorithms.



### Advantages of Bubble Sort

1. **Simplicity:**
   
   - Bubble Sort is very easy to understand and implement. The logic is straightforward, making it a good starting point for learning about sorting algorithms.

2. **In-Place Sorting:**
   
   - Bubble Sort is an in-place algorithm, meaning it requires only a small, constant amount of additional memory space (O(1) space complexity). No additional storage is needed for the sorting process.

3. **Stable Sort:**
   
   - Bubble Sort maintains the relative order of equal elements in the sorted output. This property is useful when the stability of the sorting is important, such as when sorting a list of records based on one key while preserving the order of another key.

4. **Adaptive Nature (Best-Case Scenario):**
   
   - If the array is already sorted, Bubble Sort can detect this and stop early, achieving a best-case time complexity of O(n). This makes it adaptive in some cases where the array is nearly sorted.

### Disadvantages of Bubble Sort

1. **Inefficiency:**
   
   - Bubble Sort is inefficient for large datasets due to its O(n^2) time complexity in the worst and average cases. This makes it impractical for sorting large arrays, especially when other more efficient algorithms (like Quick Sort, Merge Sort, or Heap Sort) are available.

2. **Excessive Comparisons and Swaps:**
   
   - Bubble Sort makes many comparisons and swaps even when only a few elements are out of order. This leads to unnecessary work and slow performance compared to more advanced algorithms that use fewer operations.

3. **Lack of Scalability:**
   
   - As the size of the input array increases, the performance of Bubble Sort deteriorates rapidly. This lack of scalability makes it unsuitable for real-world applications involving large datasets.

4. **No Early Termination for Non-Sorted Arrays:**
   
   - Although Bubble Sort can terminate early if the array is already sorted, it does not have an inherent mechanism to optimize performance when only a few elements are out of order. It still performs all iterations in the worst case.

### Summary

- **When to Use:** Bubble Sort is useful in small or simple applications where the input size is small, or when the array is nearly sorted and the simplicity of the algorithm is a priority.
- **When to Avoid:** For large datasets or performance-critical applications, Bubble Sort should be avoided in favor of more efficient sorting algorithms.
