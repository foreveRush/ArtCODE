package ua.artcode.week2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_07 {
    /*
    7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
     */
    public static void main(String[] args) {

        Random rand = new Random();
        int [] mas = new int[6];
        for(int i =0; i<6; i++ ) {
            mas[i]=rand.nextInt(4);
        }
        int [] mas1 = Arrays.copyOfRange(mas,0,mas.length/2);
        int [] mas2 = Arrays.copyOfRange(mas,mas.length/2, mas.length);
        System.out.println(Arrays.toString(mas));
        float sum1=0,sum2=0;
        for(int i=0;i<mas1.length;i++) {
            sum1+=mas1[i];
            sum2+=mas2[i];
        }
        sum1/=3;
        sum2/=3;
         if(sum1>sum2) System.out.println(Arrays.toString(mas1));
         else System.out.println(Arrays.toString(mas2));
    }

}
