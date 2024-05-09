public class Graph {
    private Edge[] graph; // adjacency list for this graph


    // Static nested class Edge
    public static class Edge { // Class Edge
        private int neighbor; // id of the neighbor (id of the destination node)
        private Edge next; // reference to the next "edge"

        public Edge(int neighbor) {
            this.neighbor = neighbor;
            next = null;
        }
    } // class Edge

    public Graph(int numVertices) {
        graph = new Edge[numVertices];
    }

    /**
     * Adds the given edge as an outgoing edge for the given vertex.
     * Modifies the adjacency list.
     *
     * @param vertexId id of the vertex
     * @param edge     outgoing edge
     *                 Do not modify.
     */
    public void addEdge(int vertexId, Edge edge) {
        Edge head = graph[vertexId]; // head of the linked list for this  node
        graph[vertexId] = edge; // insert in front
        if (head != null) {
            edge.next = head;
        }
    }


    /**
     * Use BFS or DFS to find out if there is a path from vertex 1 to vertex 2
     * @param vertex1 source vertex
     * @param vertex2 destination vertex
     */
    public boolean hasPath(int vertex1, int vertex2) {
        // If you use BFS, please refer to ArrayQueue / Queue.
        // FILL IN CODE: use BFS or DFS to find out if there is path from vertex 1 to vertex 2

        return false;
    }


    /**
     * @param vertex1 id of vertex 1
     * @param vertex2 id of vertex 2
     * @return True if there is a directed edge from i to j in the adjacency list
     */
    public boolean hasEdge(int vertex1, int vertex2) {
        // Check if there is a direct edge going from i to j

        return false;
    }

    public static void main(String[] args) {
        Graph g = new Graph(8);

        // edges going out of vertex 1
        Edge edge10 = new Edge(0);
        Edge edge12 = new Edge(2);
        g.addEdge(1, edge10);
        g.addEdge(1, edge12);

        // edge going out of 0
        Edge edge05 = new Edge(5);
        g.addEdge(0, edge05);

        //edge going out of 2
        Edge edge26 = new Edge(6);
        g.addEdge(2, edge26);

        // edges going out of 5
        Edge edge54 = new Edge(4);
        Edge edge56 = new Edge(6);
        g.addEdge(5, edge54);
        g.addEdge(5, edge56);

        // edge going out of 6
        Edge edge67 = new Edge(7);
        g.addEdge(6, edge67);

        //edge going out of 4
        Edge edge47 = new Edge(7);
        g.addEdge(4, edge47);

        // edge going out of 7
        Edge edge75 = new Edge(5);
        g.addEdge(7, edge75);

        System.out.println(g.hasPath(7, 4)); // true
        System.out.println(g.hasPath(3, 6)); // false

        System.out.println(g.hasEdge(7,2)); // false
        System.out.println(g.hasEdge(7, 5)); // true

    }
}

