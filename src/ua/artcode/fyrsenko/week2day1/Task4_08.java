package ua.artcode.fyrsenko.week2day1;

import com.sun.tools.corba.se.idl.constExpr.Equal;

import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_08 {

    public static void main(String[] args) {

        System.out.println("Введите 2 числa");
        Scanner scanner = new Scanner(System.in);
        String number1;
        String number2;

        try {
            number1=scanner.next();
            number2=scanner.next();


            if(number1.charAt(number1.length()-1)==number2.charAt(number2.length()-1)) {
                System.out.println("true");
            }
            else System.out.println("false");


        } catch (Exception e) {
            System.out.println("Error");
        }



    }
}
