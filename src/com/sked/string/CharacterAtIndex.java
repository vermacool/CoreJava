package com.sked.string;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Android on 8/8/2017.
 */
public class CharacterAtIndex {
private static Pattern PATTERN_WHITE_SPACE=Pattern.compile("\\P{javaWhitespace}+");
    public static void main(String[] args) {

        System.out.println("Enter the string");
       Scanner scString=new Scanner(System.in);

        String inputString=scString.next();
        System.out.println("Enter the index to get the character value");
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();

        //get the character at given index
        int c=inputString.charAt(index);
        System.out.println("character at index: "+(char)c);


        /*String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " +
                (char)index1);
        System.out.println("The character at position 10 is " +
                (char)index2);*/

    }
}
