package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;
import com.jad.jackytouch.share.ICar;

public class Exhaust extends AbstractCarDecorator {

    public Exhaust(ICar car, IBehavior behavior) {
        super(car, behavior, "/exhaust.txt");
    }

    @Override
    protected String getTuningName() {
        return "Exhaust";
    }
}