package com.sked.string;

/**
 * Created by Android on 11/7/2017.
 */
public class StringCompare {
    public static void main(String[] args) {
        String first = "Word";
        String second= "word";

        /**
         * we cant we "==" operator to compare two string,
         * we have to use equals() methods
         */

        if(first.equals(second)){
            System.out.println("both strings are equals");
        }else {
            System.out.println("both strings are not equals");
        }

        //we can ignore case using method equalsIgnoreCase()
        if(first.equalsIgnoreCase(second)){
            System.out.println("both strings are equal");
        }else {
            System.out.println("both strings are not equals");
        }
    }
}
