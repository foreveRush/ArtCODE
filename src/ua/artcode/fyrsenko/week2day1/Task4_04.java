package ua.artcode.fyrsenko.week2day1;

import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_04 {

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        float value;
        try {
            value = scanner.nextFloat();
            if(value>=0 && value<=1) System.out.println("true");
            else System.out.println("false");
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
