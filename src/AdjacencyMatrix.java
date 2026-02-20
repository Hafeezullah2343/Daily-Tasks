public class AdjacencyMatrix {

    private int vertices;
    private int[][] adjMatrix;

    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }

    String matrixToString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                sb.append(adjMatrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AdjacencyMatrix adjMatrix = new AdjacencyMatrix(4);
        adjMatrix.addEdge(0, 1);
        adjMatrix.addEdge(0, 2);
        adjMatrix.addEdge(1, 2);
        adjMatrix.addEdge(2, 3);
        System.out.println(adjMatrix.matrixToString());
    }
}
