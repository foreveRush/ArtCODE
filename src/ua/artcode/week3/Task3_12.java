package ua.artcode.week3;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 07.06.16.
 */
public class Task3_12 {

    /*
    3.12*. Строки. Ввод пароля.
		Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
		- длинна пароля должна быть от 8 до 20 символов
		- в пароле должны быть как маленькие так и большие буквы
		- должны быть цифры
		- не должен содержать слов 'password', 'pass', 'gfhjkm'
		- генерировать случайный пароль используя символы: a-z A-Z 0-9
     */

    public static void main(String[] args) {

        System.out.println("Input your new password please or if you want to generate password -  input 'gen'");
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        if (pass.equalsIgnoreCase("gen")) {

            System.out.println("Your new password is " + genPass());
            return;

        }

        if (checkPassword(pass)) {
            System.out.println("Repeat password please");

            if (pass.equals(scanner.nextLine())) {
                System.out.println("GOOD!");
                return;
            } else {
                System.out.println("Your repeated password isn't same with the first one");
            }
        }


    }

    public static boolean checkPassword(String pass) {

        if (pass.length() < 8 || pass.length() > 20) {
            System.out.println("Wrong length, password must be 8-20 characters");
            return false;
        }

        boolean upCase = pass.toUpperCase().equals(pass) ? false : true;
        boolean lowCase = pass.toLowerCase().equals(pass) ? false : true;

        if (!upCase || !lowCase) {
            System.out.println("Password must contain low and up case");
            return false;
        }

        if (pass.matches("^\\D*$")) {
            System.out.println("Password must contain digits");
            return false;
        }

        if (pass.contains("password") || pass.contains("pass") || pass.contains("gfhjkm")) {
            System.out.println("Password can't contains 'password', 'pass' or 'gfhjkm'");
            return false;
        }

        return true;
    }

    public static String genPass() {

        String pass = "";
        Random random = new Random();

        char next = 0;
        int range = 10;

        for (int i = 0; i < 10; i++) {

            switch (random.nextInt(3)) {
                case 0: {
                    next = '0';
                    range = 10;
                }
                break;
                case 1: {
                    next = 'a';
                    range = 26;
                }
                break;
                case 2: {
                    next = 'A';
                    range = 26;
                }
                break;
            }

            pass += (char) (next + random.nextInt(range));

        }

        return pass;
    }
}
