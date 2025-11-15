package tasklar.SentyabrTask.AlgoritmTasks.MatrixTranspose;

public class MatrixTranspose {
    public static int[][] matrixTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
       return transpose;
    }

}
