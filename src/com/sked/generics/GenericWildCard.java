package com.sked.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 6/13/2017.
 */
public class GenericWildCard {


    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        double sumOfValues = sum(number);
        System.out.printf("sum of values is %f", sumOfValues);
    }

    private static double sum(List<? extends Number> number) {
        double sum = 0;
        for (Number numValue : number) {
            sum += numValue.doubleValue();
        }
        return sum;
    }
}
