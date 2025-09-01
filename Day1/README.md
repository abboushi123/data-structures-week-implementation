# Day 1 - Data Structures in Java

## Implemented Structures
- **DynamicArray**: A resizable array that grows automatically when full.
- **SinglyLinkedList**: A linear linked list with nodes connected in one direction.
- **StackArray**: A stack implementation using a fixed-size array.
- **StackLinkedList**: A stack implementation using a linked list for dynamic size.

## Time & Space Complexity
- DynamicArray:
  - Access: O(1)
  - Insert (amortized): O(1)
  - Space: O(n)
- SinglyLinkedList:
  - Insert at head: O(1)
  - Insert at tail: O(n)
  - Search: O(n)
- StackArray & StackLinkedList:
  - Push/Pop/Peek: O(1)
  - Space: O(n)

## Usage Example
```bash
javac DynamicArray.java
java DynamicArray
```

## How to Run Tests
Each file includes a `main` method with sample usage.
