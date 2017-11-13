package com.sked.adapterdesignpattern;

/**
 * Created by Android on 8/12/2017.
 * Regulatory system that receive temperature in centigrade but furnance controller accepts
 * only fahrenheit format.
 */
public class FurnanceRegulatorySystem {

    public void regulateFurnanceTemperature(){
        FurnanceControllerAdapter furnanceControllerAdapter=new FurnanceControllerAdapter();
        furnanceControllerAdapter.changeFurnaceTemperature(300);
    }
}
