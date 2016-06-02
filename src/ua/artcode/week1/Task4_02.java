package ua.artcode.week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_02 {

    public static void main(String[] args) {

        System.out.println("Введите 3 числа");
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[3];

        try {
            for(int i=0; i< array.length; i++) {
                array[i]=scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println("Максимальное число = "+array[2]);
            System.out.println("Минимальное число = "+array[0]);

        } catch (Exception e) {
            System.out.println("Error");
        }



    }

}
