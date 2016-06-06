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

        int[][] array = new int[5][];

        array[0] = new int[]{1, 2};
        array[1] = new int[]{1, 2, 3, 4, 5};
        array[2] = new int[]{1, 2, 3, 4};
        array[3] = new int[]{1, 2, 3};
        array[4] = new int[]{1};


        // Task A
        int indexOfMaxLengthLine = array[0].length;
        int indexOfMinLengthLine = array[0].length;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length > array[indexOfMaxLengthLine].length) indexOfMaxLengthLine = i;
            if (array[i].length < array[indexOfMinLengthLine].length) indexOfMinLengthLine = i;
        }

        int[] temp = array[indexOfMinLengthLine];
        array[indexOfMinLengthLine] = array[indexOfMaxLengthLine];
        array[indexOfMaxLengthLine] = temp;

        MatrixUtils.printMatrix(array);

        //Task B


    }
}
