package ua.artcode.week2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_10 {

    /*
    10) public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end}
     */
    public static void main(String[] args) {

        Random rand = new Random();
        int [] arr1 = new int[10];
        int sum1=0, sum2=0;
        for(int i =0; i<10; i++ ) {
            arr1[i]=rand.nextInt(50);
        }
        System.out.println(Arrays.toString(arr1));
        arr1=splitArray(arr1,5,1);
        System.out.println(Arrays.toString(arr1));
    }


    public static int[] splitArray(int[] arr, int start, int end) {
        int [] mas = new int[arr.length-start-end];
        mas = Arrays.copyOfRange(arr,start,arr.length-end);
        return mas;

    }



}
