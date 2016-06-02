package ua.artcode.fyrsenko.week2day1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_14 {

    public static void main(String[] args) {

        int value = 534345;
        String valueString = Integer.toString(value);
        int [] digits = new int[6];
        for(int i=0; i<6; i++) {
            digits[i]=Integer.parseInt(Character.toString(valueString.charAt(i)));
        }
        if(digits[0]+digits[1]+digits[2]==digits[3]+digits[4]+digits[5]) System.out.println(value + " счастливое число");
        else System.out.println(value + " не является счастливым числом");

    }
}
