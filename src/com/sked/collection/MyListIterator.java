package com.sked.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Android on 11/11/2017.
 */
public class MyListIterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        ListIterator li=null;
        list.add(60);
        list.add(40);
        list.add(30);
        list.add(19);
        list.add(29);
        list.add(57);
        li=list.listIterator();
        System.out.println("Elements in forward directiton");
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("Elements in backward directiton");
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
