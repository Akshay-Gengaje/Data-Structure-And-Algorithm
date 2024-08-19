Linear search is a simple searching algorithm used in data structures and algorithms (DSA) to find the position of a specific element (referred to as the target) within a list or array. It works by sequentially checking each element of the list until the target element is found or the end of the list is reached.

### How Linear Search Works:

1. **Start from the first element:** Begin at the first element of the list or array.
2. **Compare each element with the target:** Check if the current element is equal to the target element.
3. **If found, return the position:** If the current element matches the target, return its position (index) in the list.
4. **If not found, move to the next element:** If the current element does not match the target, move to the next element and repeat the process.
5. **End of the list:** If the target element is not found after checking all elements, return a value indicating that the target is not present in the list (usually `-1` or `null`).

### Example of Linear Search

Let's say we have the following array and we want to find the position of the number `7`:

```java
int[] arr = {3, 5, 2, 9, 7, 6};
int target = 7;
```

Here's how linear search would work step-by-step:

1. **Step 1:** Compare `arr[0]` (which is `3`) with `7`. They are not equal, so move to the next element.
2. **Step 2:** Compare `arr[1]` (which is `5`) with `7`. They are not equal, so move to the next element.
3. **Step 3:** Compare `arr[2]` (which is `2`) with `7`. They are not equal, so move to the next element.
4. **Step 4:** Compare `arr[3]` (which is `9`) with `7`. They are not equal, so move to the next element.
5. **Step 5:** Compare `arr[4]` (which is `7`) with `7`. They are equal, so return the index `4`.

### Java Implementation of Linear Search

Here’s how you can implement linear search in Java:

```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 7, 6};
        int target = 7;

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
```

### Output:
```
Element found at index: 4
```

### Time Complexity
- **Best Case:** `O(1)` (when the target element is the first element)
- **Worst Case:** `O(n)` (when the target element is the last element or not in the list at all)
- **Average Case:** `O(n)`

### Space Complexity
- **Space Complexity:** `O(1)` (because no extra space is required other than a few variables)

Linear search is straightforward but not the most efficient algorithm for large datasets, especially when other algorithms like binary search (for sorted arrays) can perform the search operation in `O(log n)` time. However, linear search is versatile since it can be used on unsorted and unordered datasets.