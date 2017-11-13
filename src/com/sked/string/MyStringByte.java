package com.sked.string;

/**
 * Created by Android on 11/7/2017.
 */
public class MyStringByte {
    public static void main(String[] args) {
        String str="hey...Welcome to world of human";
        byte[] byteArray=str.getBytes();

        System.out.println("String array length: "+str.length());
        System.out.println("byte array length: "+byteArray.length);
    }
}
