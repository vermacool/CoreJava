package com.sked.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Android on 11/14/2017.
 */
public class BasicOperation {
    //add elements to the ArrayList
    //get elements by index
    //add elements at a specific index
    //Is arraylist empty?
    public static void main(String[] args) {
        int[] arr = {23, 3, 12, 43, 5};
        ArrayList<Integer> arrayListSort = new ArrayList<>();
        for (int i : arr) {
            arrayListSort.add(i);
        }
        Collections.sort(arrayListSort);
        System.out.println(arrayListSort);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("java");
        arrayList.add("c++");
        arrayList.add("python");
        arrayList.add("salesforce");
        System.out.println(arrayList);
        System.out.println();
        System.out.println("Get element at index 2" + arrayList.get(2));
        System.out.println();
        arrayList.add(2, "scala");
        System.out.println();
        System.out.println("Is arrayList empty? " + arrayList.isEmpty());
        System.out.println();
        System.out.println("Is arrayList Contains 'JAVA'? " + arrayList.contains("java"));
        System.out.println();
        System.out.println("Index of salesforce is? " + arrayList.indexOf("salesforce"));
        System.out.println();
        System.out.println("Size of the arraylist is? " + arrayList.size());

        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {

            if ("c++".equals(itr.next())) {
                itr.remove();
            }


        }
        System.out.println(arrayList);

    }

}
