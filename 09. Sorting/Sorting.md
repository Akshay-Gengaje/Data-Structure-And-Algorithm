Here's a comprehensive comparison of various sorting algorithms used in Data Structures and Algorithms (DSA). I've organized the comparison based on different criteria such as time complexity, space complexity, stability, and use cases. This format should help you quickly grasp the key aspects of each algorithm.

---

### 1. **Bubble Sort**

- **Algorithm**: Repeatedly swaps adjacent elements if they are in the wrong order.
- **Time Complexity**:
  - Best Case: **O(n)** (Already sorted)
  - Average Case: **O(n²)**
  - Worst Case: **O(n²)**
- **Space Complexity**: **O(1)**
- **Stability**: Yes
- **In-Place**: Yes
- **Use Case**: Simple and easy to implement, but inefficient for large datasets. Useful for educational purposes.

---

### 2. **Selection Sort**

- **Algorithm**: Selects the minimum (or maximum) element from the unsorted part and swaps it with the first unsorted element.
- **Time Complexity**:
  - Best Case: **O(n²)**
  - Average Case: **O(n²)**
  - Worst Case: **O(n²)**
- **Space Complexity**: **O(1)**
- **Stability**: No
- **In-Place**: Yes
- **Use Case**: Simple but inefficient for large datasets. Not stable, so less preferred when stability is required.

---

### 3. **Insertion Sort**

- **Algorithm**: Builds the sorted array one element at a time by repeatedly picking the next element and inserting it into the correct position.
- **Time Complexity**:
  - Best Case: **O(n)** (Already sorted)
  - Average Case: **O(n²)**
  - Worst Case: **O(n²)**
- **Space Complexity**: **O(1)**
- **Stability**: Yes
- **In-Place**: Yes
- **Use Case**: Efficient for small datasets and nearly sorted arrays. Often used in hybrid sorting algorithms like Timsort.

---

### 4. **Merge Sort**

- **Algorithm**: Divides the array into two halves, recursively sorts them, and then merges the sorted halves.
- **Time Complexity**:
  - Best Case: **O(n log n)**
  - Average Case: **O(n log n)**
  - Worst Case: **O(n log n)**
- **Space Complexity**: **O(n)** (Not in-place)
- **Stability**: Yes
- **In-Place**: No
- **Use Case**: Suitable for large datasets and linked lists. Preferred when stability is required. Used in external sorting algorithms.

---

### 5. **Quick Sort**

- **Algorithm**: Picks a pivot element, partitions the array around the pivot, and recursively sorts the partitions.
- **Time Complexity**:
  - Best Case: **O(n log n)**
  - Average Case: **O(n log n)**
  - Worst Case: **O(n²)** (When the pivot is the smallest or largest element)
- **Space Complexity**: **O(log n)** (In-place)
- **Stability**: No
- **In-Place**: Yes
- **Use Case**: Highly efficient for large datasets, but can degrade to O(n²) without proper pivot selection. Widely used due to its efficiency and in-place nature.

---

### 6. **Heap Sort**

- **Algorithm**: Builds a max heap and repeatedly extracts the maximum element to build the sorted array.
- **Time Complexity**:
  - Best Case: **O(n log n)**
  - Average Case: **O(n log n)**
  - Worst Case: **O(n log n)**
- **Space Complexity**: **O(1)**
- **Stability**: No
- **In-Place**: Yes
- **Use Case**: Efficient for large datasets. Used in systems where O(n log n) is guaranteed without additional space.

---

### 7. **Radix Sort**

- **Algorithm**: Sorts numbers digit by digit starting from the least significant digit using a stable counting sort.
- **Time Complexity**:
  - Best Case: **O(nk)** (k is the number of digits)
  - Average Case: **O(nk)**
  - Worst Case: **O(nk)**
- **Space Complexity**: **O(n + k)**
- **Stability**: Yes
- **In-Place**: No
- **Use Case**: Efficient for sorting integers or strings where the range of digits is not too large. Suitable for large datasets.

---

### 8. **Bucket Sort**

- **Algorithm**: Distributes elements into several buckets, sorts each bucket individually, and then concatenates them.
- **Time Complexity**:
  - Best Case: **O(n + k)** (k is the number of buckets)
  - Average Case: **O(n + k)**
  - Worst Case: **O(n²)** (All elements in one bucket)
- **Space Complexity**: **O(n + k)**
- **Stability**: Yes (Depends on the sorting algorithm used within buckets)
- **In-Place**: No
- **Use Case**: Useful when input is uniformly distributed over a range. Commonly used for floating-point numbers.

---

### 9. **Counting Sort**

- **Algorithm**: Counts the number of occurrences of each element and uses this information to place the elements in the correct position.
- **Time Complexity**:
  - Best Case: **O(n + k)** (k is the range of input)
  - Average Case: **O(n + k)**
  - Worst Case: **O(n + k)**
- **Space Complexity**: **O(k)**
- **Stability**: Yes
- **In-Place**: No
- **Use Case**: Efficient for sorting integers within a small range. Not suitable for large ranges or floating-point numbers.

---

### **Summary Table**

| **Algorithm**      | **Best Case** | **Average Case** | **Worst Case** | **Space Complexity** | **Stability** | **In-Place** | **Use Case**                                   |
| ------------------ | ------------- | ---------------- | -------------- | -------------------- | ------------- | ------------ | ---------------------------------------------- |
| **Bubble Sort**    | O(n)          | O(n²)            | O(n²)          | O(1)                 | Yes           | Yes          | Simple, small datasets                         |
| **Selection Sort** | O(n²)         | O(n²)            | O(n²)          | O(1)                 | No            | Yes          | Simple, small datasets                         |
| **Insertion Sort** | O(n)          | O(n²)            | O(n²)          | O(1)                 | Yes           | Yes          | Small or nearly sorted datasets                |
| **Merge Sort**     | O(n log n)    | O(n log n)       | O(n log n)     | O(n)                 | Yes           | No           | Large datasets, stability required             |
| **Quick Sort**     | O(n log n)    | O(n log n)       | O(n²)          | O(log n)             | No            | Yes          | Large datasets, generally efficient            |
| **Heap Sort**      | O(n log n)    | O(n log n)       | O(n log n)     | O(1)                 | No            | Yes          | Large datasets, guaranteed O(n log n)          |
| **Radix Sort**     | O(nk)         | O(nk)            | O(nk)          | O(n + k)             | Yes           | No           | Large datasets, specific to integers/strings   |
| **Bucket Sort**    | O(n + k)      | O(n + k)         | O(n²)          | O(n + k)             | Yes           | No           | Uniformly distributed datasets, floating-point |
| **Counting Sort**  | O(n + k)      | O(n + k)         | O(n + k)       | O(k)                 | Yes           | No           | Small range of integers                        |

---

This table should help you quickly compare the different sorting algorithms and choose the right one based on the requirements of your problem.


