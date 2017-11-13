package com.sked.basics;

import java.util.Scanner;

/**
 * Created by Android on 10/6/2017.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number=1234;
        //System.out.println("Plese enter the number");
        /*Scanner sc = new Scanner(System.in);
        number = sc.nextInt();*/
        String str = number + "";
        String[] arr=new String[str.length()-1];
        for (int i = 0; i < str.length()-1; i++) {
            arr = str.split("");
        }
        for (int j=str.length()-1;j>= 0;j--){
            System.out.print(arr[j]);
        }
    }
}
