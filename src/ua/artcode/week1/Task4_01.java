package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_01 {

    public static void main(String[] args) {


        System.out.println("Введите число от 0 до 24");
        Scanner scaner = new Scanner(System.in);
        int time;
        try {
            time = scaner.nextInt();
            if(time<=0 || time>=24) {
                System.out.println("Error");
            }
            else if(time >=9 && time<=18) System.out.println("Я на работе");
            else System.out.println("Я отдыхаю");
        }
        catch (Exception e) {
            System.out.println("Error");
        }




    }
}
