package com.sked.string;

/**
 * Created by Android on 8/22/2017.
 */
public class Linecount {
    public static int getLineCount(String string) {
        return string.split("[\n|\r]").length;
    }

    public static void main(String[] args) {

    }
}
