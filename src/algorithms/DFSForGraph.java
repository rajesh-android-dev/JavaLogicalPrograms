package algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSForGraph {
    private int V;
    private LinkedList<Integer> adj[];

    public DFSForGraph(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.println(v+"");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }

    void DFS(){
        boolean visited[] = new boolean[V];
        for (int i =0;i<V;i++){
            if (!visited[i])
                DFSUtil(i,visited);
        }
    }

    public static void main(String[] args) {
        DFSForGraph graph = new DFSForGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        graph.DFS();
    }
}
