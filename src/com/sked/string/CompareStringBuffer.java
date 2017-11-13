package com.sked.string;

/**
 * Created by Android on 11/7/2017.
 */
public class CompareStringBuffer {
    public static void main(String[] args) {
        String str= "I am Human";
        StringBuffer stringBuffer=new StringBuffer("I am Human");

        /**
         * we can use contentEquals() method to compare content with a string buffer.
         * it return boolean value.
         */

        if(str.contentEquals(stringBuffer)){
            System.out.println("equals");
        }else {
            System.out.println("unequals");
        }

        StringBuffer sbDiff=new StringBuffer("i am super human");

        if(str.contentEquals(sbDiff)){
            System.out.println("equals sbDiff");
        }else {
            System.out.println("unequals sbDiff");
        }
    }
}
