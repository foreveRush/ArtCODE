package ua.artcode.week2;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_03 {

    public static void main(String[] args) {

        /*
        3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
         */
        int [] mas1 = new int[]{2,1,23,23,1,200,51,-12,235,-4,-123, 121};
        int [] mas2 = new int[]{20,10,203,230,10,2000,501,-102,2035,-40,-1023, 1201};
        System.out.println(Arrays.toString(mas2));
        mas2 = Arrays.copyOf(mas1,mas1.length);
        System.out.println(Arrays.toString(mas2));
    }
}
