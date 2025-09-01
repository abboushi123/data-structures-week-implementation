// Disjoint Set Union (Union-Find) with path compression and union by rank
class UnionFind {
    private final int[] parent;
    private final int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Find the representative (root) of set containing x, with path compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Union two sets by rank; returns true if union happened (i.e., different sets)
    public boolean union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb) return false;
        if (rank[ra] < rank[rb]) {
            parent[ra] = rb;
        } else if (rank[ra] > rank[rb]) {
            parent[rb] = ra;
        } else {
            parent[rb] = ra;
            rank[ra]++;
        }
        return true;
    }

    // Checks if two elements are in the same set
    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);
        uf.union(1, 2);
        uf.union(2, 3);
        uf.union(4, 5);
        System.out.println("connected(1,3): " + uf.connected(1,3)); // true
        System.out.println("connected(1,4): " + uf.connected(1,4)); // false
        uf.union(3, 4);
        System.out.println("connected(1,5): " + uf.connected(1,5)); // true
    }
}
