package com.sked.collection.arraylist;

import java.util.ArrayList;

/**
 * Created by Android on 11/16/2017.
 */
public class CopyArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Water");
        arrayList.add("air");
        arrayList.add("fire");
        arrayList.add("soil");
        arrayList.add("sky");
        System.out.println(arrayList);
        String stArray[]=new String[arrayList.size()];
        //copy arrayList to stringArray
        arrayList.toArray(stArray);
        for (String str:stArray) {
            System.out.println(str);
        }
    }
}
