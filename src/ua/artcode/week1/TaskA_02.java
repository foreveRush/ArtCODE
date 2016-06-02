package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_02 {

    public static void main(String[] args) {

        System.out.println("Введите 3 числа");
        Scanner scanner = new Scanner(System.in);
        try {
            int [] numbers = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
            for(int i : numbers) {
                if (i>0) System.out.print((int)Math.pow(i,3)+ " ");
                else System.out.print("0 ");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
