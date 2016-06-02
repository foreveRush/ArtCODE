package ua.artcode.week2;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_01 {

    public static void main(String[] args) {

        /*
        1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
         */
        int [] mas = new int[]{2,1,23,23,1,200,51,-12,235,-4,-123, 121};
        Arrays.sort(mas);
        System.out.println("min = "+ mas[0]);
        System.out.println("max = "+ mas[mas.length-1]);
    }
}
