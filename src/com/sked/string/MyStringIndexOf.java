package com.sked.string;

/**
 * Created by Android on 11/7/2017.
 */
public class MyStringIndexOf {
    public static void main(String[] args) {
        String str = "use this string for testing this";

        System.out.println("Char 's' at first occurance: " + str.indexOf('s'));

        System.out.println("String \"this\" at first occurrence: " + str.indexOf("this"));
        System.out.println();

        /**
         * Returns the first occurance from specified start index
         */
        System.out.println("First occurrence of chat 's' after 4th index onward: " + str.indexOf('s', 4));
        System.out.println("First occurance of String \"this\" from 5th index onwards: " + str.indexOf("this", 5));
        System.out.println();
        /**
         *  Q: How to find a string start with another string value in java?
         *  A: By using startsWith() method, you can get whether the string starts with the given string or not.
         *     Also this method tells that the string occurence at a specific position.
         */
        System.out.println("Is this string: " + str + " : start with \"this\"?  " + str.startsWith("this"));
        System.out.println("Is this string: " + str + " : start with \"string\"? after 9th character? " + str.startsWith("string", 9));

        System.out.println();
        /**
         *  By using lastIndexOf() method you can get last occurence of the the reference string or character.
         *  Also lastIndexOf() method gives last occurence based on a specific position.
         */
        System.out.println();
        //System.out.println(str+" : last occurrence of this: "+str.lastIndexOf("this"));
        //System.out.println(str+" : last occurrence of \"this\" from 24th position backward is : "+str.lastIndexOf("this",24));

        System.out.println(str + " : last occurrence of  character  's' from 2nd index backward:- " + str.lastIndexOf('s', 1));
        System.out.println();

        if (str.endsWith("this")){
            System.out.println(str + ": ends with \"this\" " );}
            else {
            System.out.println(str + ": don't ends with \"this\" " );
        }
    }
}
