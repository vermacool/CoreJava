package com.sked.string;

/**
 * Created by Android on 11/10/2017.
 */
public class RemoveNonAsciiChar {
    public static void main(String[] args) {
        String str = "Bj��rk����oacute�";
        System.out.println(str);
        System.out.println();
        str = str.replaceAll("[^\\p{ASCII}]", "");
        System.out.println(str);
        /**
         * Removing Html character from string .
         */
        String stringHtm = "<B>Text in bold face</B>";
        System.out.println(stringHtm);
        stringHtm = stringHtm.replaceAll("\\<.*?\\>", "");
        System.out.println(stringHtm);
        /**
         * Get the line count from the string.
         */
        String formattedString= "Learning never exhaust mind.\nAll that we see or seem is but a dream within a dream.\nBe extremely honest with oneself is a good exercise.";
        System.out.println(formattedString);
        System.out.println("ine count: "+getLineCount(formattedString));
    }

    private static int getLineCount(String str){
        return str.split("[\n|\r]").length;
    }

}
