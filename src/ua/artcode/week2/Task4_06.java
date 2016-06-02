package ua.artcode.week2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_06 {

    public static void main(String[] args) {

        /*
        6) Найти среднее арифметическое массива
         */

        Random rand = new Random();
        int [] mas = new int[5];
        float sum=0;
        for(int i =0; i<5; i++ ) {
                mas[i]=rand.nextInt(4);
                sum+= mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(sum/mas.length);
    }
}
