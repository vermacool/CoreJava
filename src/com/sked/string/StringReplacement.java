package com.sked.string;

import java.util.StringTokenizer;

/**
 * Created by Android on 11/9/2017.
 */
public class StringReplacement {
    public static void main(String[] args) {
        String str = "This     is       an      example  string";
      // System.out.println("replace 's' with  'z' : "+str.replace('s','z'));

      // String result= str.substring(11,18);
      // System.out.println(str.replace(result,"excellent").toLowerCase().trim());

        StringTokenizer stringTokenizer=new StringTokenizer(str," ");
        StringBuffer sb=new StringBuffer();
        while (stringTokenizer.hasMoreElements()){
            sb.append(stringTokenizer.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
