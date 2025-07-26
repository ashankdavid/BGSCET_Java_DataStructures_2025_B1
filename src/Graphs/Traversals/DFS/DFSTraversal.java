package Graphs.Traversals.DFS;

import java.util.*;

public class DFSTraversal {

    public static void dfsTraversalUtil(int node, List<List<Integer>> adjacencyList, boolean[] visited, List<Integer> traversalOrder) {
        visited[node] = true;
        traversalOrder.add(node);

        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                dfsTraversalUtil(neighbor, adjacencyList, visited, traversalOrder);
            }
        }
    }

    public static List<Integer> dfsTraversal(int n, List<List<Integer>> adjacencyList) {
        boolean[] visited = new boolean[n];
        List<Integer> traversalOrder = new ArrayList<>();

        dfsTraversalUtil(0, adjacencyList, visited, traversalOrder);

        return traversalOrder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }


        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjacencyList.get(u).add(v);
        }

        List<Integer> result = dfsTraversal(n, adjacencyList);

        for (int node : result) {
            System.out.print(node + " ");
        }
        System.out.println();

        sc.close();
    }
}
