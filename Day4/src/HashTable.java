import java.util.LinkedList;

class HashTable {
    private int capacity; 
    private LinkedList<Entry>[] table; 

    // Class to store key-value pairs
    static class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor: create table with given capacity
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>(); 
        }
    }

    // Hash function: maps key to index
    private int hash(int key) {
        return key % capacity;
    }

    // Insert or update a key-value pair
    public void put(int key, String value) {
        int index = hash(key); // Find bucket index
        for (Entry entry : table[index]) {
            if (entry.key == key) { // If key exists, update value
                entry.value = value;
                return;
            }
        }
        // If key does not exist, add new entry
        table[index].add(new Entry(key, value));
    }

    // Retrieve value by key
    public String get(int key) {
        int index = hash(key); // Find bucket index
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value; // Return value if found
            }
        }
        return null; // Key not found
    }

    // Test the HashTable
    public static void main(String[] args) {
        HashTable ht = new HashTable(5);

        // Insert some values
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");
        ht.put(8, "Eight"); // Collides with key 3 (same bucket)

        // Retrieve and print values
        System.out.println("Key 2: " + ht.get(2)); // Output: Two
        System.out.println("Key 8: " + ht.get(8)); // Output: Eight
    }
}
