
public class SubRectangleQueries {

    int[][] matrix;
    SubRectangleQueries(int[][] matrix){
        this.matrix = matrix;
    }

    public void updateSubQueries(int row1 , int col1 , int row2 , int col2 , int newValue){
        for(int i = row1 ; i <= row2 ; i++){
            for(int j = col1 ; j <= col2 ; j++){
                this.matrix[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col){
        return this.matrix[row][col];
    }

    public void display(){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,1,1},
                {1,1,1},
        };
        SubRectangleQueries demo = new SubRectangleQueries(matrix);
        demo.display();
        System.out.println("__________________________");
        demo.updateSubQueries(0,0,1,1,5);
        demo.display();
        System.out.println("__________________________");
        System.out.println(demo.getValue(1,1));
    }
}