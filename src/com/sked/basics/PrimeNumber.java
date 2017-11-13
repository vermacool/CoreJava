package com.sked.basics;

/**
 * Created by Android on 10/5/2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("is number is prime " + new PrimeNumber().isPrimeNumber(23));
    }

    public   boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number/ 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
