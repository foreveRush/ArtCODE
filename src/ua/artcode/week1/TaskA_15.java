package ua.artcode.week1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_15 {

    public static void main(String[] args) {

        float circleS = 20;
        float squareS = 20;

        double circleD = Math.sqrt(circleS/Math.PI);
        double squareSide = Math.sqrt(squareS);
        double squareDiagonal = squareSide*Math.sqrt(2);

        if(circleD<=squareS) System.out.println("Круг поместится в квадрат");
        else System.out.println("Круг не поместится в квадрат");

        if(squareDiagonal<=circleD) System.out.println("Квадрат поместится в круг");
        else System.out.println("Квадрат не поместится в круг");
    }
}
