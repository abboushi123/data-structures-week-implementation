class QueueLinkedList {
    private Node front, rear;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return front.data;
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front element: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element after dequeue: " + q.peek());
    }
}
