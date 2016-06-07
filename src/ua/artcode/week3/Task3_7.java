package ua.artcode.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 07.06.16.
 */
public class Task3_7 {

    /*
    3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String input = scanner.nextLine();
        String[] array = input.split("\\s+");

        String maxWord = "";
        for (String s : array) {
            if (s.length() >= maxWord.length()) {
                maxWord = new String(s);
            }
        }

        System.out.println(maxWord);

    }
}
