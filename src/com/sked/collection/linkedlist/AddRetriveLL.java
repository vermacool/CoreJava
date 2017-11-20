package com.sked.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Android on 11/20/2017.
 */
public class AddRetriveLL {

    public static void main(String[] args) {
        LinkedList<String> mList = new LinkedList<>();
        mList.add("First Name");
        mList.add("Middle Name");
        mList.add("Last Name");
        System.out.println(mList + "\n");
        mList.addFirst("Title");
        mList.offerFirst("Pre Title");
        System.out.println(mList + "\n");
        mList.addLast("supporting ");
        mList.offerLast("Parent ");
        mList.offer("Name");
        System.out.println(mList + "\n");

        System.out.println("\n Retrive first element: " + mList.getFirst());
        System.out.println("\n Retrive first element: " + mList.peekFirst());
        System.out.println("\n Retrive first element: " + mList.element());
        System.out.println("\n Retrive first element: " + mList.peek());

        System.out.println("\n Retrive Last element: " + mList.getLast());
        System.out.println("\n Retrive last element: " + mList.peekLast());


        Iterator<String> itr = mList.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        mList.push("Push Mr. for title ");

        System.out.println("after push operation list " + mList);
        System.out.println(mList.poll());
        System.out.println(mList.pop());
        System.out.println("After pop operation list:  " + mList);
    }
}
