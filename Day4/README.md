# Day 4 - Data Structures in Java

## Implemented Structures
- **HashTable**: Key-value store with collision handling (chaining).
- **MinHeap**: Binary heap that always keeps the smallest element at root.
- **Graph**: Adjacency List representation.

## Time & Space Complexity
- HashTable:
  - Insert/Search/Delete: O(1) average, O(n) worst
  - Space: O(n)
- MinHeap:
  - Insert: O(log n)
  - ExtractMin: O(log n)
  - Space: O(n)
- Graph (Adjacency List):
  - Add Edge: O(1)
  - Traverse: O(V + E)
  - Space: O(V + E)

## Usage Example
```bash
javac HashTable.java
java HashTable
```

## How to Run Tests
Each file includes a `main` method with sample usage.
