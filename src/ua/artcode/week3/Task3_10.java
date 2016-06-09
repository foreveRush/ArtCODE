package ua.artcode.week3;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 07.06.16.
 */
public class Task3_10 {

    /*
    3.10*. Удалить из предложения слова которые повторяются.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String input = scanner.nextLine();
        System.out.println(removeCopies(input));
    }


    public static String removeCopies(String input) {

        String out = input;
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    out = out.replaceAll(words[i], "");
                }
            }
        }

        return out;
    }
}
