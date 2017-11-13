package com.sked.algorithm;

/**
 * Created by Android on 11/11/2017.
 */
public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 14, 3, 4, 43, 23, 23, 56};
        System.out.println("Key "+23+" Found at index "+findItemIndex(arr, 23));
    }

    private static int findItemIndex(int[] arr, int i) {
        //issue with
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == i) {
                return index;
            }
        }
        return -1;
    }
}
