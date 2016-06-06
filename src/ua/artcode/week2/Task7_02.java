package ua.artcode.week2;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task7_02 {

    /*
    2.2 Проверить или является число простым
    */

    public static void main(String[] args) {
        int test = 17;

        boolean result = isSimpleNumber(test);
        System.out.println(result);
    }

    public static boolean isSimpleNumber(int numberToTest) {

        for (int i = 2; i < numberToTest / 2; i++) {
            if (numberToTest % i == 0) {
                return false;
            }
        }
        return true;
    }


}
