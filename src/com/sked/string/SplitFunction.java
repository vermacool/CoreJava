package com.sked.string;

/**
 * Created by Android on 11/8/2017.
 */
public class SplitFunction {

    public static void main(String[] args) {
        String str = "This program splits a string based on space";
        String token[]= str.split(" ");
        for (String string:token) {
            System.out.println(string);
        }

        //str = "This     program  splits a string based on space";
        token = str.split("\\s+");
        for (String tokenObj : token) {
            //System.out.println(singleToken);
            System.out.println(tokenObj);
        }

        /**
         * Getting character array from the existing string
         */

        char[] ch= new char[7];
        str.getChars(5,12,ch/*Destination char array*/,0);
        System.out.println(ch);

    }
}
