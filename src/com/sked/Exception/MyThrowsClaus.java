package com.sked.Exception;

/**
 * Created by Android on 1/12/2018.
 */
public class MyThrowsClaus {
    public static void main(String[] args) {
        MyThrowsClaus mtc = new MyThrowsClaus();
        for (int i = 0; i < 5; i++) {
            try {
                mtc.getGarbage();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }

    private void getGarbage() throws InterruptedException{
        Thread.sleep(1000);
    }
}
