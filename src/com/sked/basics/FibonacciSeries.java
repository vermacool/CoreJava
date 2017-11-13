package com.sked.basics;

/**
 * Created by Android on 10/5/2017.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(10);
    }

    private static void printFibonacci(int count) {
        int[] fibArray = new int[count];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i < count; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        for (int i=0;i<count;i++){
            System.out.print(fibArray[i] + ",");
        }
    }
}
