package Algorithms.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

// Class representing an Edge in the graph.
class Edge {
    int src, dest, weight;
    // Constructor to initialize an edge
    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

public class Kruskal {

    /**
     * Comment Block: Find the representative of a vertex
     *
     * This method uses path compression technique to find the set to which a vertex belongs.
     * @param parent The array representing disjoint sets.
     * @param vertex The vertex whose set is to be found.
     * @return The representative of the set.
     */
    public static int find(int[] parent, int vertex) {
        if (parent[vertex] == vertex) return vertex;
        return parent[vertex] = find(parent, parent[vertex]);
    }

    /**
     * Comment Block: Perform the union of two subsets
     *
     * This method performs union of two subsets represented by src and dest.
     * @param parent The array representing disjoint sets.
     * @param src One set represented by its leader.
     * @param dest Another set represented by its leader.
     */
    public static void union(int[] parent, int src, int dest) {
        int srcParent = find(parent, src);
        int destParent = find(parent, dest);
        parent[srcParent] = destParent;
    }

    /**
     * Comment Block: Kruskal's Algorithm to find Minimum Spanning Tree
     *
     * This method implements Kruskal's algorithm to find the Minimum Spanning Tree (MST) of a graph.
     * @param edges The array of edges in the graph.
     * @param V The number of vertices in the graph.
     */
    public static void kruskal(Edge[] edges, int V) {
        // Sort edges by weight in ascending order.
        Arrays.sort(edges, Comparator.comparingInt(edge -> edge.weight));

        // Initialize parent for each vertex
        int[] parent = new int[V];
        for (int i = 0; i < V; ++i) {
            parent[i] = i;
        }

        // Process each edge in increasing weight
        for (Edge edge : edges) {
            int srcParent = find(parent, edge.src);
            int destParent = find(parent, edge.dest);

            // Check if adding this edge forms a cycle
            if (srcParent != destParent) {
                // If not, add it to MST and perform union.
                System.out.println("Edge: " + edge.src + " - " + edge.dest + ", Weight: " + edge.weight);
                union(parent, srcParent, destParent);
            }
        }
    }
}


