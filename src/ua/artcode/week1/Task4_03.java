package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_03 {

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int value;
        try {
            value = scanner.nextInt();
            if(value%7==0) System.out.println(value*2);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
