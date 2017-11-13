package com.sked.constructor;

/**
 * Created by Android on 10/7/2017.
 */
public class ParameterizeConstructor {
    private String userName;

    public ParameterizeConstructor(String name) {
        this.userName=name;
        System.out.println("ParameterizeConstructor Invoked");
        System.out.println("user name is: " + userName);
    }

    public static void main(String[] args) {
        ParameterizeConstructor pcObj = new ParameterizeConstructor("Mnaish verma");
    }
}
