package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;
import com.jad.jackytouch.share.ICar;

public class Rims extends AbstractCarDecorator {

    public Rims(ICar car, IBehavior behavior) {
        super(car, behavior, "/rims.txt");
    }

    @Override
    protected String getTuningName() {
        return "Rims";
    }
}
