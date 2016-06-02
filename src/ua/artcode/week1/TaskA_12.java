package ua.artcode.week1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_12 {

    public static void main(String[] args) {

        int windLevel= 1;
        switch (windLevel) {
            case 1:
                System.out.println("Ветер слабый, скорость 1-4 м\\с");
                break;
            case 2:
                System.out.println("Ветер умеренный, скорость 5-10 м\\с");
                break;
            case 3:
                System.out.println("Ветер сильный, скорость 9-18 м\\с");
                break;
            case 4:
                System.out.println("Ветер ураганный, скорость больше 19 м\\с");
                break;
            default:
                System.out.println("Error");
        }
    }
}
