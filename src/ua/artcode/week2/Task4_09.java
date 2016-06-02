package ua.artcode.week2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_09 {

    public static void main(String[] args) {
        /*
        9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
         */
        Random rand = new Random();
        int [] arr1 = new int[6];
        int [] arr2 = new int[6];
        int sum1=0, sum2=0;
        for(int i =0; i<6; i++ ) {
            arr1[i]=25+rand.nextInt(50);
            if(arr1[i]%2==0) sum1++;
            arr2[i]=25+rand.nextInt(50);
            if(arr2[i]%2==0) sum2++;
        }
        if(sum1>sum2) System.out.println("В первом массиве больше парных чисел");
        else System.out.println("Во втором массиве больше парных чисел");

    }
}
