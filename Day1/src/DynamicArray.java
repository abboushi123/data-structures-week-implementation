public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 2;
        size = 0;
        arr = new int[capacity];
    }

    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return arr[index];
    }

    public int size() {
        return size;
    }

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
