# Day 2 - Data Structures in Java

## Implemented Structures
- **QueueArray**: Queue using circular array.
- **QueueLinkedList**: Queue using linked list (dynamic size).
- **DoublyLinkedList**: Linked list with next and prev pointers.
- **CircularLinkedList**: Linked list where last node connects back to head.

## Time & Space Complexity
- QueueArray:
  - Enqueue/Dequeue: O(1)
  - Space: O(n)
- QueueLinkedList:
  - Enqueue/Dequeue: O(1)
  - Space: O(n)
- DoublyLinkedList:
  - Insert/Delete at ends: O(1)
  - Search: O(n)
- CircularLinkedList:
  - Insert at end: O(1)
  - Traverse entire list: O(n)

## Usage Example
```bash
javac QueueArray.java
java QueueArray
```

## How to Run Tests
Each file includes a `main` method with sample usage.
