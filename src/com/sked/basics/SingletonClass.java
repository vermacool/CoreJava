package com.sked.basics;

/**
 * Created by Android on 8/9/2017.
 */
public class SingletonClass {
    private static SingletonClass mObj;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (mObj == null) {
            mObj = new SingletonClass();
        }
        return mObj;
    }

    public static void main(String[] args) {
        SingletonClass mObject = getInstance();
        mObject.testMe();
    }

    private void testMe() {
        System.out.println("hey its working");
    }
}
