package ua.artcode.week3;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task3_1 {

    /*
    3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
     */

    public static void main(String[] args) {

        int[][] matrix = MatrixUtils.genMatrix(5, 7);
        System.out.println("===== Before =====");
        MatrixUtils.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 5 == 0 && matrix[i][j] != 0) matrix[i][j] = 8;
            }
        }
        System.out.println("===== After =====");
        MatrixUtils.printMatrix(matrix);


    }
}
