import java.util.Arrays;

public class Dijkstra {
    int findMinVertex(int[] dist, boolean[] visited) {
        int minVertex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < minValue) {
                minValue = dist[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    public void dijkstra(int[][] graph, int source) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        for (int i = 0; i < V - 1; i++) {
            int u = findMinVertex(dist, visited);
            visited[u] = true;
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !visited[v] && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printSolution(dist, source);
    }

    private void printSolution(int[] dist, int source) {
        System.out.println("Vertex\tDistance from Source (" + source + ")");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 10, 0, 30, 100 },
                { 10, 0, 50, 0, 0 },
                { 0, 50, 0, 20, 10 },
                { 30, 0, 20, 0, 60 },
                { 100, 0, 10, 60, 0 }
        };
        Dijkstra sd = new Dijkstra();
        sd.dijkstra(graph, 0);
    }
}
