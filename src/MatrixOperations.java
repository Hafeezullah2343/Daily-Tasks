import java.util.Scanner;

/**
 * MatrixOperations demonstrates creation, input, display, and addition of two matrices.
 */
public class MatrixOperations {

    // Display a matrix with a title
    private static void displayMatrix(int[][] matrix, String title) {
        System.out.println(title);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Compute sum of two matrices
    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }

    // Take input for a matrix
    private static int[][] inputMatrix(Scanner scanner, int rows, int cols, String title) {
        int[][] matrix = new int[rows][cols];
        System.out.println(title);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int rows = 2;
        int cols = 2;

        // Input matrices
        int[][] matrixA = inputMatrix(scanner, rows, cols, "Input Matrix A:");
        int[][] matrixB = inputMatrix(scanner, rows, cols, "Input Matrix B:");

        // Display matrices
        displayMatrix(matrixA, "Matrix A:");
        displayMatrix(matrixB, "Matrix B:");

        // Compute sum
        int[][] sumMatrix = addMatrices(matrixA, matrixB);

        // Simulate processing delay
        System.out.println("Calculating sum, please wait...");
        for (int i = 0; i < 30; i++) {
            Thread.sleep(1000);
            System.out.print("*");
        }
        System.out.println();

        // Display sum matrix
        displayMatrix(sumMatrix, "Sum of Matrix A and Matrix B:");
        scanner.close();
    }
}
