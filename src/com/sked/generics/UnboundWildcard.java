package com.sked.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 6/13/2017.
 */
public class UnboundWildcard {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(7);
        ints.add(8);
        ints.add(9);
        sumOfValues(ints);
    }

    private static void sumOfValues(List<?> ints) {
        for (Object obj : ints) {
            System.out.println(obj);
        }
    }
}
