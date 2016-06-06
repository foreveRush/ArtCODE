package ua.artcode.week2;

/**
 * Created by Serhii Fursenko on 06.06.16.
 */
public class Task7_05 {

    /*
    2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"
     */

    public static void main(String[] args) {

        String string = "Hello world! This is a string. Have a nice day!";
        System.out.print("\""+string+"\" -> ");

        string = string.replace('a','@');
        System.out.println("\""+string+"\"");

    }
}
