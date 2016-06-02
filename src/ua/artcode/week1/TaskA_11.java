package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_11 {

    public static void main(String[] args) {

        System.out.println("Введите число от 1 до 99");
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
            if(value<1 || value > 99) System.out.println("Error");
            if(value>=5 && value<=20) {
                System.out.println(value+ " копеек");
                return;
            }
            String lastDigitString = Integer.toString(value);
            lastDigitString = Character.toString(lastDigitString.charAt(lastDigitString.length()-1));
            int lastDigitInt = Integer.parseInt(lastDigitString);
            if(lastDigitInt==1) System.out.println(value+ " копейка");
            else if(lastDigitInt>1 && lastDigitInt<5 ) System.out.println(value+ " копейки");
            else if(lastDigitInt>=5 || lastDigitInt==0) System.out.println(value+ " копеек");


        }catch (Exception e) {
            System.out.println("Error");
        }
    }
}
