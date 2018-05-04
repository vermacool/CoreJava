package com.sked.oops;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.Properties;
import java.util.TreeSet;

/**
 * Created by Android on 12/9/2017.
 */
public class TestProperties{

    public static void main(String[] args) throws Exception {
        OutputStream outputStream = null;

        FileReader fileReader = new FileReader("db.properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.getProperty("user") + " : " + properties.getProperty("password"));

        try {
            Properties propertiesTwo = new Properties();

            outputStream = new FileOutputStream("oracle.properties");
            propertiesTwo.setProperty("js", "ekmaSkript");
            propertiesTwo.setProperty("html", "markup");
            propertiesTwo.store(outputStream, null);


        } catch (IIOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }

    }
}
