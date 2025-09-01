# Day 5 - Data Structures in Java

## Implemented Structures
- **Trie**: Prefix tree for fast string operations.
- **Union-Find (Disjoint Set)**: Structure to manage disjoint sets, supports union and find operations.
- **Graph Traversal (BFS & DFS)**: Algorithms to traverse nodes in a graph.

## Time & Space Complexity
- Trie:
  - Insert/Search/StartsWith: O(L), L = word length
  - Space: proportional to number of stored characters
- Union-Find (with optimizations):
  - Find/Union/Connected: ~O(α(n)) (almost constant)
  - Space: O(n)
- Graph Traversal:
  - BFS/DFS: O(V + E)
  - Space: O(V)

## Usage Example
```bash
javac Trie.java
java Trie
```

## How to Run Tests
Each file includes a `main` method with sample usage.
