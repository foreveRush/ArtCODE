package ua.artcode.fyrsenko.week2day1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_03 {

    public static void main(String[] args) {

        int value = 283;
        String tempString = Integer.toString(value);
        if(tempString.length()!=3) System.out.println("Error");
        if(tempString.charAt(0)==tempString.charAt(1) && tempString.charAt(0)==tempString.charAt(2)) {
            System.out.println("Все цифры одинаковые - true");
            System.out.println("Есть ли одинаковые цифры - true");
        }
        else
        {
            System.out.println("Все цифры одинаковые - false");
            if(tempString.charAt(0) == tempString.charAt(1) || tempString.charAt(0) == tempString.charAt(2) || tempString.charAt(1) == tempString.charAt(2)) {
                System.out.println("Есть ли одинаковые цифры - true");
            }
            else System.out.println("Есть ли одинаковые цифры - false");
        }


    }

}
