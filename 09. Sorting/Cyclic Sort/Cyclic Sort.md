### **Cyclic Sort: In-Depth Explanation**

#### **What is Cyclic Sort?**

Cyclic Sort is an efficient sorting algorithm that works on the idea that the numbers should be placed in the correct indices in a single pass through the array. It is particularly effective when you have an array of consecutive numbers ranging from `1` to `n` with no duplicates. The algorithm sorts the array by iterating through it and swapping the elements to their correct positions until every element is in its right place.

#### **When to Use Cyclic Sort?**

- **Fixed Range of Elements**: It’s ideal when you know that the elements are in a fixed range, like `1` to `n`.
- **No Duplicates**: The array should not have duplicate values, as Cyclic Sort doesn't handle duplicates.
- **Efficient Sorting**: When you need to sort an array in O(n) time complexity without using extra space.

#### **Why Use Cyclic Sort?**

- **In-Place Sorting**: Cyclic Sort sorts the array without requiring additional storage, making it memory efficient.
- **Optimal for Certain Scenarios**: It is particularly useful for problems where you need to find missing numbers, smallest missing positive numbers, etc., because it ensures elements are in their expected positions.

### **Working of Cyclic Sort**

1. **Initialization**:
   
   - Start from the first index.
   - Calculate the correct index for the current element.

2. **Swapping**:
   
   - If the element is not in its correct position, swap it with the element at its target position.

3. **Repeat**:
   
   - Continue this process until every element is in its correct position.

4. **Next Element**:
   
   - Move to the next element and repeat the above steps.

5. **Termination**:
   
   - The loop continues until the end of the array.

#### **Pseudocode for Cyclic Sort**

```java
for (int i = 0; i < arr.length; i++) {
    while (arr[i] != arr[arr[i] - 1]) {
        swap(arr, i, arr[i] - 1);
    }
}
```

#### **Time Complexity**

| **Operation**    | **Time Complexity** |
| ---------------- | ------------------- |
| **Best Case**    | O(n)                |
| **Average Case** | O(n)                |
| **Worst Case**   | O(n)                |

- **Space Complexity**: O(1) (In-Place Sorting)

### **Cyclic Sort: Step-by-Step Diagram**

Let’s illustrate the working of Cyclic Sort with an example:

**Example Array**: `[3, 5, 2, 1, 4]`

1. **Initial Array**: `[3, 5, 2, 1, 4]`
   
   - **Current Index (i = 0)**: `3` is not in position `0`. Swap `3` with `arr[2]`.
   - **Array after swap**: `[2, 5, 3, 1, 4]`

2. **Current Index (i = 0)**: `2` is not in position `0`. Swap `2` with `arr[1]`.
   
   - **Array after swap**: `[5, 2, 3, 1, 4]`

3. **Current Index (i = 0)**: `5` is not in position `0`. Swap `5` with `arr[4]`.
   
   - **Array after swap**: `[4, 2, 3, 1, 5]`

4. **Current Index (i = 0)**: `4` is not in position `0`. Swap `4` with `arr[3]`.
   
   - **Array after swap**: `[1, 2, 3, 4, 5]`

5. **Current Index (i = 0)**: `1` is now in position `0`.
   
   - Move to the next index.

6. **Next Iterations**: 
   
   - All elements are now in their correct positions.

**Final Sorted Array**: `[1, 2, 3, 4, 5]`

### **Flow Diagram of Cyclic Sort**

1. **Initialization**:
   
   - Start with an unsorted array.

2. **Position Calculation**:
   
   - Determine the correct index for the current element.

3. **Swapping**:
   
   - If the element is not in the correct position, swap it.

4. **Repeat**:
   
   - Continue until all elements are correctly positioned.

5. **Termination**:
   
   - The array is sorted.


