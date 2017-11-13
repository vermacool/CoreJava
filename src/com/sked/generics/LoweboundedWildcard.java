package com.sked.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 6/13/2017.
 */
public class LoweboundedWildcard {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();


        Double sum = Sum(ints);
    }

    private static Double Sum(List<? super Integer> ints) {
        double sum = 0;
        ints.add(new Integer(80));
        return sum;

    }


}

