package com.sked;

public class Main {


    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }


    public static void main(String[] args) {

        System.out.printf("greater among three number is %d %d %d %s  ", 4, 7, 9, ":-" + maximum(4, 7, 9));
        System.out.println();
        System.out.printf("greater among three string is %s %s %s %s  ", "Manish", "TGBR", "Duffer", ":-" + maximum("Manish", "TGBR", "Rashmi"));
        System.out.println();


    }
}
