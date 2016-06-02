package ua.artcode.week1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_09 {

    public static void main(String[] args) {

        float height = 1.8f;
        float weight = 83f;
        float idealWeight = (height-1)*100;
        System.out.println("Ваш идеальный вес = "+ String.format("%.2f",idealWeight)+ " килограмм");
        if(idealWeight>weight) System.out.println("Вам стоит больше кушать");
        else System.out.println("Вам стоит меньше кушать");

    }
}
