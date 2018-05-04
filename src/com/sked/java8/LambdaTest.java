package com.sked.java8;

/**
 * Created by Android on 12/11/2017.
 */
public class LambdaTest {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread executed")).start();

    }
}
