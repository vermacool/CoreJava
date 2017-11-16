package com.sked.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Android on 11/14/2017.
 */
public class ArrayClone {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ministry");
        arrayList.add("court");
        arrayList.add("Temple");
        arrayList.add("Fair");
        arrayList.add("Market");
        ArrayList<String> copyArray= (ArrayList<String>) arrayList.clone();
        Iterator<String> itr=copyArray.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
