package Graphs.Traversals.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphBFS {
    int V;
    GraphBFS(int vertices){
        this.V = vertices;
    }

    ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int temp = q.poll();
            ans.add(temp);

            for(int neighbour : adjList.get(temp)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return ans;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Vertices and Edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<v; i++){
            adjList.add(new ArrayList<>());
        }

        GraphBFS g = new GraphBFS(v);

        for(int i=1; i<=e; i++){
            System.out.println("Enter the Edge: ");
            int u = sc.nextInt();
            int vertex = sc.nextInt();
            adjList.get(u).add(vertex);
        }

        ArrayList<Integer> result = g.bfsTraversal(adjList);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}