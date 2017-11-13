package com.sked.generics;

/**
 * Created by Android on 6/12/2017.
 */
public class GenericMethods {

    //generic methods
    public static <T> boolean isEqual(GenericClass<T> g1,GenericClass<T> g2){
        return g1.getObject().equals(g2.getObject());
    }

    public static void main(String[] args) {
        GenericClass<String> g1=new GenericClass<>();
        g1.setObject("Manish");
        GenericClass<String> g2=new GenericClass<>();
        g2.setObject("Manish");

        boolean isEqual=GenericMethods.isEqual(g1,g2);

        System.out.println(isEqual);


    }
}
