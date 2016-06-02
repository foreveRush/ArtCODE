package ua.artcode.fyrsenko.week2day1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_08 {

    public static void main(String[] args) {


        float price = 1002;
        System.out.println("Price is "+ price);
        if(price>=1000) System.out.println("Price with discount = " + String.format("%.2f",price*0.9));
        else System.out.println("No discount");
    }
}
