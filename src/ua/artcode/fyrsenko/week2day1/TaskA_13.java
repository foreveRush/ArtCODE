package ua.artcode.fyrsenko.week2day1;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class TaskA_13 {

    public static void main(String[] args) {

        int a=2, b=-10, c=9;
        System.out.println(a+ " " +b+" "+c);
        System.out.println("a+b+c="+(a+b+c));
        if((a+b+c)>0) {
            if(a<0) a/=2; else a*=2;
            if(b<0) b/=2; else b*=2;
            if(c<0) c/=2; else c*=2;
        }
        else a=b=c=0;

        System.out.println(a+ " " +b+" "+c);
    }
}
