package ua.artcode.week3;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 07.06.16.
 */
public class Task3_8 {

    /*
    3.8. Верхний регистр.

		Напишите программу, которая позволяет пользователю ввести в консоли строку,
		переводит первый символ слов в верхний регистр и результат выводит в консоль

		Вход:
		иван васильевич

		Выход:
		Иван Васильевич
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String input = scanner.nextLine();

        System.out.println(toUpperCaseFirstSymbol(input));
    }

    public static String toUpperCaseFirstSymbol(String text) {

        String[] array = text.split("\\s+");
        String result = "";
        for (int i = 0; i < array.length; i++) {
            char[] temp = array[i].toCharArray();
            temp[0] = Character.toUpperCase(temp[0]);
            result+= String.valueOf(temp)+ " ";
        }

        return result;
    }

}
