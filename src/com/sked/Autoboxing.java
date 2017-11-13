package com.sked;

/**
 * Created by Android on 6/12/2017.
 */
public class Autoboxing {

    static void m(Integer s1, Integer s2) {
        System.out.printf("int int %d %d", s1, s2);
    }

    static void m(Integer... i) {
        for (Integer integer :
                i) {
            System.out.printf("integer..." + integer);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int s1 = 20, s2 = 30,s3=30;
        m(s1, s2,s3);
    }
}
