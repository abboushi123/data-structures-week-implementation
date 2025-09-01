// Dynamic Array implementation with auto-resizing
public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 2;
        size = 0;
        arr = new int[capacity];
    }

    // Add new element, resize if full
    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = value;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return arr[index];
    }

    // Return current size
    public int size() {
        return size;
    }

    // Resize array (double the capacity)
    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(10);
        da.add(20);
        da.add(30);
        System.out.println("Size: " + da.size());
        System.out.println("Element at index 1: " + da.get(1));
    }
}
