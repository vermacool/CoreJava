package com.sked.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Android on 11/10/2017.
 */
public class MyCollectionIterator {
    public static void main(String[] args) {
        int i = 0;

        String removeElem = "C++";

        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:" + myList);
        System.out.println();
        myList.removeIf(removeElem::equals);
        System.out.println("After remove:" + myList);
        int[] array = {23, 22, 23, 44, 28};
        List<int[]> al=Arrays.asList(array);
        System.out.println("size of list is"+al.size());

        Iterator<int[]> arry = Arrays.asList(array).iterator();
        while (arry.hasNext()) {
            i++;
        }
        System.out.println("length of array is: " + i);

    }
}
