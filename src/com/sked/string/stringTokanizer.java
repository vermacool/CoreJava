package com.sked.string;

import java.util.StringTokenizer;

/**
 * Created by Android on 12/8/2017.
 */
public class stringTokanizer {
    public static void main(String[] args) {
        String str= "https://www.skedsoft.com/reader/";
        String strTokenSimple="we are humanbeing";

        StringTokenizer stToken=new StringTokenizer(str,"://.");
        StringTokenizer stTokenPlain=new StringTokenizer(strTokenSimple," ");
        while (stToken.hasMoreTokens()){
            System.out.println(stToken.nextToken());
            if (stToken.countTokens()==1){
                System.out.println("\n");
            }
            System.out.println(     );
        }

        while (stTokenPlain.hasMoreTokens()){
            System.out.println(stTokenPlain.nextToken());
            if (stTokenPlain.countTokens()==1){
                System.out.println();
            }
        }


    }
}
