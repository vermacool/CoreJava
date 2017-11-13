package com.sked.basics;

/**
 * Created by Android on 8/9/2017.
 */
public class SingletonClass {
    private static SingletonClass mObj;

    static {
        mObj = new SingletonClass();
    }

    private static SingletonClass getInstance() {
        return mObj;
    }

    private void testMe() {
        System.out.println("hey its working");
    }

    public static void main(String[] args) {
        SingletonClass mObject=getInstance();
        mObject.testMe();
    }
}
