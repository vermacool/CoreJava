package com.sked.basics;

/**
 * Created by Android on 10/28/2017.
 */
public class DeleteString {
    public static void main(String[] args) {
        String str = "1,2,3,4";
        String subStr1 = str.substring(3, 5);
        System.out.println("Sub-string is "+subStr1);

        str = str.replace(subStr1, "");
        System.out.println(str);
        //String[] strings = str.split(",");

       /* for (String strObj : strings) {
            System.out.print(strObj);
        }*/

    }
}
