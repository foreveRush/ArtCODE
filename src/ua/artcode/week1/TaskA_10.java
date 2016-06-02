package ua.artcode.week1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_10 {

    public static void main(String[] args) {

        int pricePerHour = 2;
        int day = 7;
        int timeMinutes = 10;

        if(day==6 || day==7) System.out.println("Вы должны "+(timeMinutes*pricePerHour)*0.8+ "$");
        else System.out.println("Вы должны "+timeMinutes*pricePerHour+ "$");

    }
}
