package com.sked.generics;

/**
 * Created by Android on 6/12/2017.
 */
public class GenericClass<O> {
    private O object;

    public O getObject() {
        return object;
    }

    public void setObject(O object) {
        this.object = object;
    }

    public static void main(String[] args) {


        GenericClass<String> mainObj = new GenericClass<>();
        mainObj.setObject("Manish");

        String string2 = mainObj.getObject();
        System.out.println(string2);

    }


}
