package com.sked.collection.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Android on 12/16/2017.
 */
public class SortingArray {
    public static void main(String[] args) {
        Integer[] intArray = {1, 34,57,21, 3,2, 4, 5, 6};
        List<Integer> li = Arrays.asList(intArray);
        Collections.sort(li);
        System.out.println(li);
    }
}
