package ua.artcode.fyrsenko.week2day1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task5_02 {

    public static void main(String[] args) {

        int value=4;
        int rez=1;
        for(int i=1; i<=value;i++) {
            rez*=i;
        }
        System.out.println("Факториал числа "+value+" = "+  rez);
    }
}
