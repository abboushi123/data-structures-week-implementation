import java.util.LinkedList;

class HashTable {
    private int capacity;
    private LinkedList<Entry>[] table;

    static class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, String value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public String get(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");
        ht.put(8, "Eight");

        System.out.println("Key 2: " + ht.get(2));
        System.out.println("Key 8: " + ht.get(8));
    }
}
