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
        mLinkedList.add("someone");
        mLinkedList.add("Manish");
        mLinkedList.add("is");
        mLinkedList.add("Manish");
        mLinkedList.add("that is");
        mLinkedList.add("NoOne");
        System.out.println(mLinkedList);
        System.out.println("After remove() method call:\n");
        mLinkedList.remove();
        System.out.println(mLinkedList);
        System.out.println("After remove(index) method call:\n");
        mLinkedList.remove(2);
        System.out.println(mLinkedList);
        System.out.println("After remove(object) method call:\n");
        mLinkedList.remove("aka");
        System.out.println("after remove(obj) method call result: "+mLinkedList);
        System.out.println("After removeFirst() method call:\n");
        mLinkedList.removeFirst();
        System.out.println(mLinkedList);

        System.out.println("removeFirstOccurrence() method call:\n");
        mLinkedList.removeFirstOccurrence("Manu");
        System.out.println("Result after removeFirstOccuranceMethod():"+mLinkedList);
        System.out.println("After removeLast() method call:");
        mLinkedList.removeLast();
        System.out.println("\nResult after removeLast(): "+mLinkedList);
        System.out.println("\nAfter removeLastOccurrence() method call:"+mLinkedList.removeLastOccurrence("Manish"));
        System.out.println(mLinkedList);
    }
}
