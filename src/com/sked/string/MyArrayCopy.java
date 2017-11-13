package com.sked.string;

/**
 * Created by Android on 11/7/2017.
 */
public class MyArrayCopy {
    public static void main(String[] args) {
        char ch[] = {'a', 'd', ' ', 'g', 'o', 'l', ' ', 'p'};

        /**
         * We can copy a char array to a string by using
         * copyValueOf() method.
         */
        String chArray = String.copyValueOf(ch);
        System.out.println(chArray);

        /**
         * We can copy a range of character in char array to a string by using
         * copyValueOf() method.
         */
        String subStr=String.copyValueOf(ch,1,5);
        System.out.println(subStr);

    }
}
