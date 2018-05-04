package com.sked.collection;

import java.util.Vector;

/**
 * Created by Android on 11/11/2017.
 */
public class VectorOperation {
    public static void main(String[] args) {
        Vector<String> vct=new Vector<>();
        //adding element to end
        vct.add("first");
        vct.add("second");
        vct.add("third");
        vct.add(null);
        System.out.println(vct);
        //adding element to specified position
        vct.add(2,"random");
        System.out.println(vct);

        //getting elements by index
        System.out.println("Element at index 3 is: "+vct.get(3));
        //getting first element
        System.out.println("First element of vector is:  "+vct.firstElement());
        //getting last element
        System.out.println("Last element of vector is: "+vct.lastElement());
        //check whether string is empty or not
        System.out.println("Check whether vector is empty or not: "+vct.isEmpty());
    }
}
