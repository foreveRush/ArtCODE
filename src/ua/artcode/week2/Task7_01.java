package ua.artcode.week2;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task7_01 {

    public static void main(String[] args) {
        /*
        2.1 Инвертировать массив (без использования допольнительного массива)
         */
        int[] array = {2, 10, 22, 23, -325, 546, -34};

        System.out.println(Arrays.toString(array));

        invertArray(array);

        System.out.println(Arrays.toString(array));

    }

    public static void invertArray(int[] array) {
        int temp =0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
    }

}
