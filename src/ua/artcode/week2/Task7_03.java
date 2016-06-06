package ua.artcode.week2;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task7_03 {

    /*
    2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
     */

    public static void main(String[] args) {

        String string = "Hello world! This is a string. Have a nice day!";
        char [] letters = string.toCharArray();
        char searchSymbol = 'l';
        int sum =0;
        for(char c : letters) {
            if(c==searchSymbol) sum++;
        }

        System.out.println("\""+string+"\" contain "+sum+" \""+searchSymbol+"\"");
    }

}
