package com.sked.keywords.native_keyword;

/**
 * Created by Android on 10/14/2017.
 */
public class Main {
    public native int square(int num);

    public static void main(String[] args) {
        System.loadLibrary("Main.c");
        System.out.println(new Main().square(2));
    }
}
