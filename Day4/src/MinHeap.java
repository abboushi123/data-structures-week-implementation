// MinHeap implementation using array
class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;   

    // Constructor: initialize heap with given capacity
    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Get parent index of node i
    private int parent(int i) { return (i - 1) / 2; }

    // Get left child index of node i
    private int left(int i) { return 2 * i + 1; }

    // Get right child index of node i
    private int right(int i) { return 2 * i + 2; }

    // Swap two elements in the heap array
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert a new key into the heap
    public void insert(int key) {
        if (size == capacity) {
            System.out.println("Heap full");
            return;
        }
        // Place the new key at the end
        heap[size] = key;
        int i = size;
        size++;

        // Fix min-heap property by moving element up
        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Extract (remove) the minimum element (root of heap)
    public int extractMin() {
        if (size <= 0) return -1;      // empty heap
        if (size == 1) return heap[--size]; // only one element

        // Store root value
        int root = heap[0];

        // Move last element to root and reduce size
        heap[0] = heap[--size];

        // Restore min-heap property
        heapify(0);

        return root;
    }

    // Ensure subtree with root i follows min-heap property
    private void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        // Find smallest among root, left, and right
        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;

        // If root is not smallest, swap with smallest and continue
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Test MinHeap implementation
    public static void main(String[] args) {
        MinHeap mh = new MinHeap(10);

        // Insert elements
        mh.insert(3);
        mh.insert(2);
        mh.insert(15);
        mh.insert(5);
        mh.insert(4);

        // Extract min twice
        System.out.println("Extracted min: " + mh.extractMin());
        System.out.println("Extracted min: " + mh.extractMin());
    }
}
