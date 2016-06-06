package ua.artcode.week2;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task7_04 {

    /*
    2.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
		Количество позиций и массив указывает пользователь
     */

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));

        ShiftArray(array, 6);
        System.out.println(Arrays.toString(array));



    }

    public static void ShiftArray(int[] array, int delta) {

        int temp = 0;
        for(int i = 0; i < delta; i++) {
            temp = array[array.length-1];
            for(int j = array.length-1; j > 0; j--) {
                array[j]=array[j-1];
            }
            array[0]=temp;
        }
    }
}
