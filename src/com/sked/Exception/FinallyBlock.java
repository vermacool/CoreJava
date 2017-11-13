package com.sked.Exception;

/**
 * Created by Android on 8/22/2017.
 */

public class FinallyBlock {
    /**
     * The runtime system always execute the code within finally block regardless of what happened in try block.
     * so its a good place to keep clean up code.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Exception will occur here ,after catch block control will goto finally block
         */
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Numeric overflow in the expression : ");
        }
        /**
         * In this case exception won't .After executing try block control will go to finally block.
         */

        try{
            int i=10/10;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("code has reached 2nd finally block");
        }
    }
}
