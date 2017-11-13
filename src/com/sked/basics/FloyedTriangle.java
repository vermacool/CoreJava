package com.sked.basics;

import java.util.Scanner;

/**
 * Created by Android on 8/3/2017.
 */
public class FloyedTriangle {


    public static void main(String[] args) {
        int i, j, num = 1, range;
        System.out.println("Enter range of triangle");
        Scanner scanner = new Scanner(System.in);
        range = scanner.nextInt();
        for (i = 1; i <= range; i++) {
            for (j = 1; j <= i; j++) {

                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
