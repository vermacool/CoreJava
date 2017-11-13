package com.sked.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 8/10/2017.
 */
public class DuplicateElement {

    private int findDuplicate(List<Integer> numbers) {
        int biggestNumber = numbers.size() - 1;
        int total = findSum(numbers);
        return total - (biggestNumber * (biggestNumber + 1) / 2);

    }

    private int findSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> mList = new ArrayList<>();
        for (int i = 1; i <=30; i++) {
            mList.add(i);
        }
        mList.add(20);
        DuplicateElement mObj = new DuplicateElement();
        System.out.println("Duplicate element is: " + mObj.findDuplicate(mList));
    }
}
