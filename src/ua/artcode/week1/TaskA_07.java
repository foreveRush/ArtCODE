package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_07 {

    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner scanner = new Scanner(System.in);
        try {
            int month = scanner.nextInt();
            if(month<1 || month>12) System.out.println("Error");
            else {
                if (month==12 || month ==1 || month==2) System.out.println("Зима");
                else if (month >2 && month<6) System.out.println("Весна");
                else if (month>=6 && month<9) System.out.println("Лето");
                else System.out.println("Осень");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
