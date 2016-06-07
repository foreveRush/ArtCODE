package ua.artcode.week3;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 07.06.16.
 */
public class Task3_6 {

    /*
    3.6. Нули

		Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.

		Вход:
		10001101001

		Выход:
		(2,4) - цепочка нулей
		(5,6) - цепочка единиц
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность бит");

        char[] input = scanner.next().toCharArray();

        for (char c : input) {
            if (c != '0' && c != '1') {
                System.out.println("Ошибка ввода");
                return;
            }
        }

        System.out.println(findCharMaxChain(input, '0'));
        System.out.println(findCharMaxChain(input, '1'));


    }

    public static String findCharMaxChain(char[] array, char ch) {

        int maxSequence = 0, maxSequenceStartPosition = 0, maxSequenceEndPosition = 0, tempEndPosition = 0, tempSum;


        for (int i = 0; i < array.length; i++) {

            if (array[i] != ch) {
                continue;
            }

            tempSum = 0;
            for (int j = i; j < array.length; j++) {

                if (array[j] == array[i]) {

                    tempSum++;

                } else {

                    tempEndPosition = j;
                    break;
                }
            }

            if (tempSum > maxSequence) {

                maxSequence = tempSum;
                maxSequenceStartPosition = i + 1;
                maxSequenceEndPosition = tempEndPosition;
            }

        }
        return String.format("(%s,%s) - цепочка %s", maxSequenceStartPosition, maxSequenceEndPosition, ch);
    }
}
