package com.sked.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Android on 11/10/2017.
 */
public class MyCollectionIterator {
    public static void main(String[] args) {
        String removeElem="C++";

        List<String> myList=new ArrayList<>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:"+myList);
        System.out.println();
        myList.removeIf(removeElem::equals);
        System.out.println("After remove:"+myList);

    }
}
