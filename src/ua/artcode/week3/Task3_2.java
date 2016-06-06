package ua.artcode.week3;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task3_2 {

    /*
    3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
     */

    public static void main(String[] args) {

        boolean[][] logicMatrix = new boolean[5][5];

        for (int i = 0; i < logicMatrix.length; i++) {
            for (int j = 0; j < logicMatrix.length; j++) {
                logicMatrix[i][j] = i == j ? true : false;
            }
        }
        MatrixUtils.printMatrix(logicMatrix);
    }
}
