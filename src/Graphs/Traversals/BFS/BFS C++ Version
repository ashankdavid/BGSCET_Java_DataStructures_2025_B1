// #include <iostream>
// #include <vector>
// #include <queue>

// using namespace std;

// // Function to perform BFS traversal of the graph
// vector<int> bfsTraversal(int n, const vector<vector<int>>& adjacencyList) {
//     vector<bool> visited(n, false); // Keep track of visited nodes
//     vector<int> traversalOrder; // To store the BFS traversal order
//     queue<int> q;

//     // Start BFS from vertex 0
//     q.push(0);
//     visited[0] = true;

//     while (!q.empty()) {
//         int current = q.front();
//         q.pop();
//         traversalOrder.push_back(current);

//         // Traverse neighbors of current node
//         for (int neighbor : adjacencyList[current]) {
//             if (!visited[neighbor]) {
//                 visited[neighbor] = true;
//                 q.push(neighbor);
//             }
//         }
//     }

//     return traversalOrder;
// }

// int main() {
//     int n, m;
//     cin >> n >> m; // Number of vertices (n) and edges (m)

//     vector<vector<int>> adjacencyList(n);

//     // Read edges and construct adjacency list
//     for (int i = 0; i < m; ++i) {
//         int u, v;
//         cin >> u >> v;
//         adjacencyList[u].push_back(v);
//     }

//     // Perform BFS traversal starting from vertex 0
//     vector<int> result = bfsTraversal(n, adjacencyList);

//     // Output the traversal order
//     for (int node : result) {
//         cout << node << " ";
//     }
//     cout << endl;

//     return 0;
// }



Alternate version with Classes

#include <iostream>
#include<vector>
#include<queue>
using namespace std;

class Graph{
    private:
    int V;

    public:
    Graph(int v){
        this->V = v;
    }

    vector<int> bfsTraversal(vector<vector<int>> &AdjList){
        vector<bool> visited(V, false);
        vector<int> ans;
        queue<int> q;

        q.push(0);
        visited[0] = true;
        while(!q.empty()){
            int front = q.front();
            q.pop();
            ans.push_back(front);

            for(int neighbour : AdjList[front]){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.push(neighbour);
                }
            }
        }
        return ans;
    }
};

int main(){
    int v, e;
    cout << "Enter Vertices and Edges: ";
    cin >> v >> e;
    vector<vector<int>> AdjList(v);
    Graph g(v);
    for(int i=1; i<=e; i++){
        int u,v;
        cout << "Enter Edge " << i << ": ";
        cin >> u >> v;
        AdjList[u].push_back(v);
    }

    vector<int> result = g.bfsTraversal(AdjList);
    cout << "The BFS Traversal is: " << endl;
    for(int i : result){
        cout << i << " ";
    }
    return 0;
}