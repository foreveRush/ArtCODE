package ua.artcode.week3;

import com.sun.tools.javac.util.List;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task3_3 {

    /*
    3.3. Написать метод, который проверяет является ли строка палиндромом
     */

    public static void main(String[] args) {

        String string = "boob";
        System.out.println("\"" + string + "\"" + " is a polindrom: " + isPolindrom(string));

    }

    public static boolean isPolindrom(String string) {

        string = string.replaceAll("\\s", "");
        String leftPart = string.substring(0, string.length() / 2);
        String rightPart = new StringBuilder(string.substring(string.length() - string.length() / 2, string.length())).reverse().toString();

        return leftPart.equalsIgnoreCase(rightPart) ? true : false;
    }


}
