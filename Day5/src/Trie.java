// Trie implementation for lowercase English letters
class Trie {
    private static class Node {
        Node[] children = new Node[26];
        boolean isEnd;
    }

    private final Node root = new Node();

    // Inserts a word into the trie.
    public void insert(String word) {
        Node cur = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (cur.children[idx] == null) cur.children[idx] = new Node();
            cur = cur.children[idx];
        }
        cur.isEnd = true;
    }

    // Returns true if the word is in the trie.
    public boolean search(String word) {
        Node node = findNode(word);
        return node != null && node.isEnd;
    }

    // Returns true if there is any word in the trie that starts with the given prefix.
    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    // Helper to traverse the trie according to a string and return the last node (or null).
    private Node findNode(String s) {
        Node cur = root;
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            if (idx < 0 || idx >= 26) return null; // only 'a'..'z' supported in this simple impl
            if (cur.children[idx] == null) return null;
            cur = cur.children[idx];
        }
        return cur;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apply");

        System.out.println("search(app): " + trie.search("app"));     // true
        System.out.println("search(apple): " + trie.search("apple")); // true
        System.out.println("startsWith(ap): " + trie.startsWith("ap"));// true
        System.out.println("search(apt): " + trie.search("apt"));     // false
    }
}
