package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_05 {

    public static void main(String[] args) {

        System.out.println("Введите 2 числa");
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(a>b) System.out.println(a-b);
            if(b>a) System.out.println(a+b);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
