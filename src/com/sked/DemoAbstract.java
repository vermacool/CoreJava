package com.sked;

/**
 * Created by Android on 7/15/2017.
 */
public abstract class DemoAbstract {
    int x, y;

    void moveTo(int x, int y) {
        System.out.println("move to coordinate from 0,0 to %d%d :"+ x+","+y);
    }
    abstract void draw();
    abstract void resize();
}
