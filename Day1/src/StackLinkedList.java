// Stack implementation using linked list
class StackLinkedList {
    private Node top;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push element
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek element
    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Check empty
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}
