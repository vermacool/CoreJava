package com.sked.string;

/**
 * Created by Android on 11/7/2017.
 */
public class Concatenation {
    public static void main(String[] args) {
        String first = "i am ";
        String second = "Human";


        String d = first + second;
        System.out.println(d);

        d = first.concat(second);
        System.out.println(d);
    }
}
