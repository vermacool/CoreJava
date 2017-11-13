package com.sked.adapterdesignpattern;

/**
 * Created by Android on 8/12/2017.
 * FurnanceController class, which controls furnance temperature
 */
public class FurnanceController {

    /**
     * this accept method only in fahrenheit format
     * @param heatLevel
     */
    public void changeFurnaceTemperature(int heatLevel){
        System.out.println("furnance temperature: "+heatLevel);
    }
}
