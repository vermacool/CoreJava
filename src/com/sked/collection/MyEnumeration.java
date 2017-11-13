package com.sked.collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Android on 11/11/2017.
 */
public class MyEnumeration {
    public static void main(String[] args) {
        Vector<String> compLanguage=new Vector<>();
        Enumeration<String> enumeration= null;
        compLanguage.add("java");
        compLanguage.add("kotlin");
        compLanguage.add("jsp");
        compLanguage.add("Servlet");
        compLanguage.add("EJB");
        compLanguage.add("php");
        compLanguage.add("perl");
        enumeration=compLanguage.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
