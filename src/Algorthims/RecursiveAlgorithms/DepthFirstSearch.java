package Algorthims.RecursiveAlgorithms;

public class DepthFirstSearch {
    // Comment Block: Depth-First Search Function
    // This function performs the DFS operation on a given graph.
    // Parameters:
    // graph - A 2D array representing the adjacency matrix of the graph.
    // visited - A boolean array to keep track of visited nodes.
    // node - The current node to explore.
    public static void dfs(int[][] graph, boolean[] visited, int node) {
        // If the node has already been visited, return
        if (visited[node]) {
            return;
        }

        // Mark the node as visited
        visited[node] = true;

        // Output the visited node
        System.out.println("Visited: " + node);

        // Explore each neighbor of the current node
        for (int i = 0; i < graph[node].length; i++) {
            // If this node is connected to the current node and it has not been visited yet
            if (graph[node][i] == 1 && !visited[i]) {
                // Recursively call DFS on this neighbor
                dfs(graph, visited, i);
            }
        }
    }
}

