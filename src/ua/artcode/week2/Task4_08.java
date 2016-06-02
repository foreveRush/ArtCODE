package ua.artcode.week2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_08 {

    public static void main(String[] args) {

        /*
        8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
	   который получается в результате суммы arr1[i] + arr2[i]
         */
        Random rand = new Random();
        int [] arr1 = new int[6];
        int [] arr2 = new int[6];
        int [] arr3 = new int[6];
        for(int i =0; i<6; i++ ) {
            arr1[i]=rand.nextInt(4);
            arr2[i]=rand.nextInt(4);
            arr3[i]=arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
