package com.sked.collection.linkedlist;

import java.util.LinkedList;

/**
 * Created by Android on 11/20/2017.
 */
public class RemoveOperaion {
    public static void main(String[] args) {
        LinkedList<String> mLinkedList=new LinkedList<>();
        mLinkedList.add("Mr.");
        mLinkedList.add("Manish ");
        mLinkedList.add("Kumar");
        mLinkedList.add("Verma");
        mLinkedList.add("aka");
        mLinkedList.add("Manu");
        System.out.println(mLinkedList);
        System.out.println("After remove() method call:\n");
        mLinkedList.remove();
        System.out.println(mLinkedList);
        System.out.println("After remove(index) method call:\n");
        mLinkedList.remove(2);
        System.out.println(mLinkedList);
        System.out.println("After remove(object) method call:");
        System.out.println("After removeFirst() method call:");
        System.out.println("After removeFirstOccurrence() method call:");
        System.out.println("After removeLast() method call:");
        System.out.println("After removeLastOccurrence() method call:");

    }
}
