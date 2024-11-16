import java.io.*;
import java.util.*;

public class BusCount {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static int[] findShortestPath(int[][] graph, int source, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n];

        dist[source] = 0;

        for (int count = 0; count < n - 1; count++) {
            int minDist = Integer.MAX_VALUE;
            int u = -1;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }

            if (u == -1) break;
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int m = fr.nextInt();

        // Read distance matrix
        int[][] dist = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = fr.nextInt();
            }
        }

        // Read employees at each location
        int[] employees = new int[m-1];
        for (int i = 0; i < m-1; i++) {
            employees[i] = fr.nextInt();
        }

        // Read bus capacity
        int capacity = fr.nextInt();

        // Find shortest paths from office (location 0)
        int[] shortestDist = findShortestPath(dist, 0, m);

        // Sort locations by distance from office
        int[][] locations = new int[m-1][2];
        for (int i = 1; i < m; i++) {
            locations[i-1][0] = shortestDist[i];
            locations[i-1][1] = i-1;
        }

        Arrays.sort(locations, (a, b) -> Integer.compare(a[0], b[0]));

        // Calculate required buses
        int buses = 0;
        int remainingCapacity = 0;

        // Process employees starting from farthest location
        for (int i = m-2; i >= 0; i--) {
            int loc = locations[i][1];
            int remaining = employees[loc];

            while (remaining > 0) {
                if (remainingCapacity == 0) {
                    buses++;
                    remainingCapacity = capacity;
                }
                int pickup = Math.min(remaining, remainingCapacity);
                remaining -= pickup;
                remainingCapacity -= pickup;
            }
        }

        System.out.print(buses);
    }
}