package com.sked.collection.arraylist;

/**
 * Created by Android on 11/22/2017.
 */
public class SystemCopyMethod {
    public static void main(String[] args) {
        int[] arrayOne={21,34,45,32,43,12};
        int[] arayTwo=new int[arrayOne.length];
        System.arraycopy(arrayOne,0,arayTwo,0,arrayOne.length);
        for (int item:arayTwo){
            System.out.println(item);
        }

    }
}
