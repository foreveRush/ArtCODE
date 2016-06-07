package ua.artcode.week3;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public abstract class MatrixUtils {
    /*
    Матрицы генерировать случайными числами и размер матрицы вводит юзер.
     */

    public static int[][] genMatrix(int sizeX, int sizeY) {

        int[][] matrix = new int[sizeX][sizeY];

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                matrix[i][j] = (int) (Math.random() * 3);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static void printMatrix(boolean[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static int[][] copyMatrix (int[][] matrix){

        int[][] result = new int[matrix.length][matrix[0].length];

        for(int i=0; i< matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {

                result[i][j] = matrix[i][j];
            }
        }

        return result;
    }

}
