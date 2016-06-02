package ua.artcode.fyrsenko.week2day1;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task5_03 {

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        try {
            String temp = scanner.next();
            int sum=0;
            for(int i=0; i<temp.length(); i++) {
                if(Character.toString(temp.charAt(i)).equals("8")) sum++;
            }
            System.out.println("8 встречается "+sum+" раз");
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
