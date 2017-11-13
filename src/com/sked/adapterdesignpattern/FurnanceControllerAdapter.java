package com.sked.adapterdesignpattern;

/**
 * Created by Android on 8/12/2017.
 * Adapter class, which converts temperature from centigrade format to fahrenheit format.
 */

public class FurnanceControllerAdapter extends FurnanceController {
    /**
     * This method access temperature in centigrade
     *
     * @param heatLevel
     */
    public void controllerTemperature(int heatLevel) {
        //change temp from centigrade to fahrenheit
        heatLevel = ((heatLevel - 32) * 5) / 9;
        changeFurnaceTemperature(heatLevel);
    }
}
