package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task5_01 {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        StringBuilder temp = new StringBuilder();
        try {
            int value = scanner.nextInt();
            while (value>0) {
                temp.append(value%2);
                value/=2;
            }
            System.out.println(temp.reverse());
        }catch (Exception e) {
            System.out.println("Error");
        }
    }
}
