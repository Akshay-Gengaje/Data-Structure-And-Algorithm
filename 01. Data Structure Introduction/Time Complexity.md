# Time Complexity of Each DS -

Here's the table showing the time complexities (Best Case, Average Case, Worst Case) for accessing, searching, inserting, and deleting the nth element in various linear and non-linear data structures:

| **Data Structure**           | **Operation**           | **Best Case**     | **Average Case** | **Worst Case** |
| ---------------------------- | ----------------------- | ----------------- | ---------------- | -------------- |
| **Array**                    | Access (nth element)    | O(1)              | O(1)             | O(1)           |
|                              | Search                  | O(1) (if sorted)  | O(n)             | O(n)           |
|                              | Insertion (at end)      | O(1)              | O(n)             | O(n)           |
|                              | Deletion (from start)   | O(1)              | O(n)             | O(n)           |
| **Singly Linked List**       | Access (nth element)    | O(n)              | O(n)             | O(n)           |
|                              | Search                  | O(1) (first node) | O(n)             | O(n)           |
|                              | Insertion (at head)     | O(1)              | O(1)             | O(1)           |
|                              | Deletion (at head)      | O(1)              | O(1)             | O(1)           |
| **Doubly Linked List**       | Access (nth element)    | O(n)              | O(n)             | O(n)           |
|                              | Search                  | O(1) (first node) | O(n)             | O(n)           |
|                              | Insertion (at head)     | O(1)              | O(1)             | O(1)           |
|                              | Deletion (at head)      | O(1)              | O(1)             | O(1)           |
| **Stack (array-based)**      | Access (nth element)    | O(n)              | O(n)             | O(n)           |
|                              | Search                  | O(n)              | O(n)             | O(n)           |
|                              | Insertion (push)        | O(1)              | O(1)             | O(1)           |
|                              | Deletion (pop)          | O(1)              | O(1)             | O(1)           |
| **Queue (array-based)**      | Access (nth element)    | O(n)              | O(n)             | O(n)           |
|                              | Search                  | O(n)              | O(n)             | O(n)           |
|                              | Insertion (enqueue)     | O(1)              | O(1)             | O(1)           |
|                              | Deletion (dequeue)      | O(1)              | O(1)             | O(1)           |
| **Binary Search Tree (BST)** | Access (nth element)    | O(log n)          | O(log n)         | O(n)           |
|                              | Search                  | O(log n)          | O(log n)         | O(n)           |
|                              | Insertion               | O(log n)          | O(log n)         | O(n)           |
|                              | Deletion                | O(log n)          | O(log n)         | O(n)           |
| **Heap**                     | Access (nth element)    | O(log n)          | O(log n)         | O(log n)       |
|                              | Search                  | O(n)              | O(n)             | O(n)           |
|                              | Insertion               | O(1)              | O(log n)         | O(log n)       |
|                              | Deletion (root)         | O(log n)          | O(log n)         | O(log n)       |
| **Graph (Adjacency List)**   | Access (nth node)       | O(V + E)          | O(V + E)         | O(V + E)       |
|                              | Search (BFS/DFS)        | O(V)              | O(V + E)         | O(V + E)       |
|                              | Insertion (vertex/edge) | O(1)              | O(1)             | O(1)           |
|                              | Deletion (vertex/edge)  | O(1)              | O(V + E)         | O(V + E)       |

### **Key**

- **V**: Number of vertices (nodes) in a graph
- **E**: Number of edges in a graph

This table gives a comprehensive overview of how different operations perform across various linear and non-linear data structures. The choice of data structure depends on the required operation's efficiency for a given problem.
