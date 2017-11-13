package com.sked.generics;

/**
 * Created by Android on 6/12/2017.
 */
public class GenericInheritance {
    /**
     * We know that Java inheritance allows us to assign a variable A to another variable B if A is subclass of B.
     * So we might think that any generic type of A can be assigned to generic type of B,
     * but it’s not the case.
     **/
    public static void main(String[] args) {
        String str = "abc";
        Object obj = new Object();

        obj = str;//works because string is a object,inheritance in java
        MyClass<String> myClass1 = new MyClass<>();
        MyClass<Object> myClass2=new MyClass<>();

        obj=myClass1;//MyClass<T> ia parent object

    }

    public static class MyClass<T> {}
}
