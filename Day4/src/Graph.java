import java.util.*;

// Graph implementation using adjacency list
class Graph {
    private int vertices;                 
    private LinkedList<Integer>[] adjList; 

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices]; // create array of lists
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>(); // initialize each list
        }
    }

    // Add an edge (undirected graph: add both ways)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest); // add edge src -> dest
        adjList[dest].add(src); // add edge dest -> src
    }

    // Print adjacency list of graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer node : adjList[i]) {
                System.out.print(" -> " + node);
            }
            System.out.println();
        }
    }

    // Test the graph implementation
    public static void main(String[] args) {
        Graph g = new Graph(5);

     
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

     
        g.printGraph();
    }
}
