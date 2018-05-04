package com.sked.Exception;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Android on 1/12/2018.
 */
public class MultipalCatchBlock {
    public static void main(String[] args) {

        MultipalCatchBlock mcb = new MultipalCatchBlock();
        mcb.execute(1);
        mcb.execute(2);
    }

    private   Integer getInteger(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    private   URL makeUrl(String stUrl) throws MalformedURLException {
        return new URL(stUrl);
    }

    private void execute(int value) {
        try {
            if (value == 1) {
                getInteger("7u");

            } else {
                makeUrl("www.proficiency.com");
            }
        } catch (NumberFormatException ne) {
            System.out.println("Inside number exception"+ ne.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("Inside url exception"+e.getMessage());
        }
        catch (Exception exception){
            System.out.println("Inside exception:- " + exception.getMessage());
        }
    }
}
