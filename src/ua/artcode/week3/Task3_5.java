package ua.artcode.week3;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task3_5 {
    /*
    3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
	     b) Поменять наибольший и наименьший столбик в двухмерном массиве.
     */

    public static void main(String[] args) {


        // Task A

        int[][] matrix = MatrixUtils.genMatrix(5, 3);
        System.out.println("===== BEFORE =====");
        MatrixUtils.printMatrix(matrix);
        System.out.println();

        int maxSum = matrix[0][0];
        int minSum = Integer.MAX_VALUE;
        int tempSum;

        int indexOfMaxRow = 0;
        int indexOfMinRow = 0;

        for (int i = 0; i < matrix.length; i++) {

            tempSum = matrix[i][0];

            for (int j = 1; j < matrix[i].length; j++) {
                tempSum += matrix[i][j];
            }

            if (tempSum > maxSum) {
                maxSum = tempSum;
                indexOfMaxRow = i;
            }

            if (tempSum < minSum) {
                minSum = tempSum;
                indexOfMinRow = i;
            }
        }

        int[] temp = matrix[indexOfMinRow];
        matrix[indexOfMinRow] = matrix[indexOfMaxRow];
        matrix[indexOfMaxRow] = temp;

        System.out.println("===== AFTER CHANGE ROWS=====");
        MatrixUtils.printMatrix(matrix);


        // Task B

        maxSum = matrix[0][0];
        minSum = Integer.MAX_VALUE;
        tempSum = 0;

        int indexOfMaxCol = 0;
        int indexOfMinCol = 0;
        int j = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            tempSum = matrix[0][i];
            for (j = 1; j < matrix.length; j++) {

                tempSum += matrix[j][i];
            }

            if (tempSum > maxSum) {
                maxSum = tempSum;
                indexOfMaxCol = i;
            }

            if (tempSum < minSum) {
                minSum = tempSum;
                indexOfMinCol = i;
            }
        }


        for (int i = 0; i < matrix.length; i++) {

            tempSum = matrix[i][indexOfMinCol];
            matrix[i][indexOfMinCol] = matrix[i][indexOfMaxCol];
            matrix[i][indexOfMaxCol] = tempSum;
        }

        System.out.println("===== AFTER CHANGE COLS =====");
        MatrixUtils.printMatrix(matrix);

    }
}
