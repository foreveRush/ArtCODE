package ua.artcode.week3;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task3_4 {

    /*
    3.4. Создать массив, который будет состоять из диагонали матрици

		1 3 5
		4 5 7  -  1 5 6
		4 5 6
     */

    public static void main(String[] args) {

        int[][] matrix = MatrixUtils.genMatrix(5, 5);
        MatrixUtils.printMatrix(matrix);
        System.out.println();

        int[] diagonal = new int[5];

        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }

        System.out.println(Arrays.toString(diagonal));
    }
}
