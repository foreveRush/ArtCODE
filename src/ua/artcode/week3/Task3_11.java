package ua.artcode.week3;

/**
 * Created by Serhii Fursenko on 07.06.16.
 */
public class Task3_11 {

    /*
    3.11*. Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.
     */

    public static void main(String[] args) {

        int[][] matrix = MatrixUtils.genMatrix(5, 5);
        MatrixUtils.printMatrix(matrix);
        System.out.println();
        matrix = rotateMatrix(matrix, 180);
        MatrixUtils.printMatrix(matrix);

    }

    public static int[][] rotateMatrix(int[][] matrix, int angle) {

        if (matrix.length != matrix[0].length || angle % 90 != 0) {

            int[][] result = new int[1][1];
            return result;
        }

        int[][] result = new int[matrix.length][matrix.length];

        int times = (angle / 90) % 4;

        for (int z = 0; z < times; z++) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    result[i][j] = matrix[matrix.length - 1 - j][i];

                }
            }
            matrix = MatrixUtils.copyMatrix(result);
        }

        return result;
    }
}
