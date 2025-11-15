package tasklar.SentyabrTask.AlgoritmTasks.MatrixTranspose;

import static tasklar.SentyabrTask.AlgoritmTasks.MatrixTranspose.MatrixTranspose.matrixTranspose;

public class Main {
    static void main() {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] transposed = matrixTranspose(matrix);

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
