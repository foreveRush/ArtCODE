package ua.artcode.fyrsenko.week2day1;

import java.util.Scanner;

/**
 * Created by admin on 02.06.16.
 */
public class TaskA_01 {

    public static void main(String[] args) {

        System.out.println("Введите 3 стороны треугольника");
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        try {
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            number3 = scanner.nextInt();

            int max = Math.max(number3,Math.max(number1, number2));
            if(number1<max && number2<max) {
                if (max*max==number1*number1+number2*number2)
                    System.out.println("true");
            }
            else if(number1<max && number3<max) {
                if (max*max==number1*number1+number3*number3)
                    System.out.println("true");
            }
            else if(number2<max && number3<max) {
                if (max*max==number3*number3+number2*number2)
                    System.out.println("true");
            }
            else System.out.println("false");

        } catch (Exception e) {
            System.out.println("Error");
        }


    }
}
