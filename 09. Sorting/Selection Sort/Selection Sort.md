# Selection Sort in Java

**Selection Sort** is a simple comparison-based sorting algorithm. It divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty, and the unsorted sublist is the entire input list.

**Working Principle:**
1. **Find the Minimum:** Start with the first element. Look through the entire unsorted part of the array to find the smallest element.
2. **Swap:** Swap this smallest element with the first element of the unsorted part.
3. **Increment:** Move the boundary between the sorted and unsorted sublist one element to the right.
4. **Repeat:** Repeat the process until the array is sorted.

### Steps with Example

Consider an array: **[64, 25, 12, 22, 11]**

#### Step 1: Initial Array

```
[64, 25, 12, 22, 11]
```

- The first element is `64`. We need to find the minimum value in the array from index `0` to `4`.

- Minimum value is `11`.

#### Step 2: Swap the first element with the minimum value

```
[11, 25, 12, 22, 64]
```

- Now, `11` is in its correct position. The first position is sorted, and the unsorted part is `[25, 12, 22, 64]`.

#### Step 3: Move to the next element and repeat the process

- The next element is `25`. We need to find the minimum value in the unsorted array from index `1` to `4`.

- Minimum value is `12`.

```
[11, 12, 25, 22, 64]
```

- Swap `25` and `12`.

#### Step 4: Continue the Process

- Now, the array is `[11, 12, 25, 22, 64]`.

- Next, find the minimum value in the unsorted array `[25, 22, 64]`.

- Minimum value is `22`.

```
[11, 12, 22, 25, 64]
```

- Swap `25` and `22`.

#### Step 5: Final Step

- The last part of the array is `[25, 64]`. Here, `25` is already in the correct position, so the array is now sorted.

```
[11, 12, 22, 25, 64]
```

### Visualization Diagram

Here’s a simple diagram to visualize the Selection Sort process:

```
Initial Array: [64, 25, 12, 22, 11]

Step 1:  [11, 25, 12, 22, 64]  // Swap 64 and 11
Step 2:  [11, 12, 25, 22, 64]  // Swap 25 and 12
Step 3:  [11, 12, 22, 25, 64]  // Swap 25 and 22
Step 4:  [11, 12, 22, 25, 64]  // Array is sorted
```

### Java Implementation

Here’s how you can implement Selection Sort in Java:

```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### Output
```
Original Array:
64 25 12 22 11 

Sorted Array:
11 12 22 25 64 
```

### Time Complexity
- **Best Case:** O(n^2)
- **Average Case:** O(n^2)
- **Worst Case:** O(n^2)

### Space Complexity
- **O(1)** (Selection Sort is an in-place sorting algorithm.)

This explains how Selection Sort works in Java with a detailed step-by-step example and implementation.