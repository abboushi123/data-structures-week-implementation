import java.util.*;

class GraphTraversal {
    private final int vertices;
    private final List<List<Integer>> adj;

    public GraphTraversal(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) adj.add(new ArrayList<>());
    }

    // Undirected graph; for directed, remove the second add
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Breadth-First Search starting from 'start'
    public List<Integer> bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> order = new ArrayList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            order.add(u);
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        return order;
    }

    // Depth-First Search (iterative) starting from 'start'
    public List<Integer> dfs(int start) {
        boolean[] visited = new boolean[vertices];
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> order = new ArrayList<>();

        stack.push(start);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (visited[u]) continue;
            visited[u] = true;
            order.add(u);
            // Push neighbors in reverse to visit in natural increasing order if adj lists are sorted
            List<Integer> neighbors = adj.get(u);
            for (int i = neighbors.size() - 1; i >= 0; i--) {
                int v = neighbors.get(i);
                if (!visited[v]) stack.push(v);
            }
        }
        return order;
    }

    public static void main(String[] args) {
        GraphTraversal g = new GraphTraversal(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("BFS from 0: " + g.bfs(0)); // e.g., [0, 1, 2, 3, 4, 5]
        System.out.println("DFS from 0: " + g.dfs(0)); // e.g., [0, 1, 3, 5, 4, 2] depending on adjacency order
    }
}
