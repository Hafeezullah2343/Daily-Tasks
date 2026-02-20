import java.util.LinkedList;

public class Graph {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);// this is undirected graph
        adjList[destination].add(source);//remove this line if directed graph
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i+"->");
            for(Integer vertex : adjList[i]) {
                System.out.print(vertex+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2,3);
        graph.printGraph();
    }
}
