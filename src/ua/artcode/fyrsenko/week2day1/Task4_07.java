package ua.artcode.fyrsenko.week2day1;

import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_07 {

    public static void main(String[] args) {

        System.out.println("Введите 2 числa");
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(a%b==0) System.out.println("true "+ a/b +" " + 0 );
            else if(b%a==0) System.out.println("true "+ b/a +" " + 0 );
            else if (a>b)System.out.println("false " + a/b + " " + (((float)a/b) - (a/b)));
            else System.out.println("false " + a/b + " " + (((float)a/b) - (a/b)));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
