package ua.artcode.fyrsenko.week2day1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_04 {

    public static void main(String[] args) {

        int kmPerHour = 10;
        int mPerSec = 3;

        if(kmPerHour>mPerSec*3.6) System.out.println(kmPerHour + "km\\h > " +mPerSec + "m\\s");
        else System.out.println(kmPerHour + "km\\h < " +mPerSec + "m\\s");
    }
}
