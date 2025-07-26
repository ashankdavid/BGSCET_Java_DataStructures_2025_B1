package Graphs.Representation.AdjList;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList;

    Graph(int size){
        adjList = new ArrayList<>();
        for(int i=0; i<size; i++){
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void printAdjList(){
        for(int i=0; i<adjList.size(); i++){
            System.out.print(i + "->");
            for(int j : adjList.get(i)){
                System.out.print(j + ", ");
            }
            System.out.println();
        }
    }
}

class DriverCode{
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0,5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(5,4);
        g.addEdge(4,3);
        g.addEdge(4,1);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(3,2);

        g.printAdjList();
    }
}
