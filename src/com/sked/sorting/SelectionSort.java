package com.sked.sorting;

/**
 * Created by Android on 11/15/2017.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray={23,32,12,45,21,3,46,45};
        int[] sortedArray= doSelectionSort(unsortedArray);
        for (int item : sortedArray) {
            System.out.print(item+"\t");
        }
    }

    private static int[] doSelectionSort(int[] unsortedArray) {
        for (int i=0;i<=unsortedArray.length-1;i++){
            int index = i;
            for (int j=i+1;j<unsortedArray.length;j++){
                if(unsortedArray[j]<unsortedArray[index]){
                    index = j;
                }
            }
            int minNum = unsortedArray[index];
            unsortedArray[index] = unsortedArray[i];
            unsortedArray[i] = minNum;
        }
        return unsortedArray;
    }
}
