# Day 5 - Data Structures in Java

## Implemented Structures
- Trie
- Union-Find (Disjoint Set)
- Graph Traversal (BFS & DFS)

## How to Run
1. Navigate to the `src` directory.
2. Compile a file using `javac FileName.java`.
3. Run using `java FileName`.

### Examples
```bash
javac Trie.java
java Trie

javac UnionFind.java
java UnionFind

javac GraphTraversal.java
java GraphTraversal
```

## Complexity Analysis (Big-O)

### Trie
- Insert(word of length L): **O(L)**
- Search(word): **O(L)**
- startsWith(prefix of length P): **O(P)**
- Space: proportional to the number of stored characters (up to 26-way branching per node).

### Union-Find (with path compression + union by rank)
- find(x): **Amortized ~O(α(N))**, where α is the inverse Ackermann function (practically constant).
- union(a, b): **Amortized ~O(α(N))**
- connected(a, b): **Amortized ~O(α(N))**
- Space: **O(N)**

### Graph Traversal
- Using adjacency list with V vertices and E edges:
  - BFS from a node: **O(V + E)**
  - DFS from a node: **O(V + E)**
- Space: **O(V)** for visited + queue/stack (up to **O(V)**).
