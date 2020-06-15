package ua.artcode.week2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_05 {

    public static void main(String[] args) {
        /*
        5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
         */
        Random rand = new Random();
        
        int [] mas = new int[10];
        
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {  // try to use ternaty operator
                mas[i]= rand.nextInt() * 2;
            } else {
                mas[i] = rand.nextInt() * 2 + 1;
            }
        }
        
        System.out.println(Arrays.toString(mas));
    }
}
