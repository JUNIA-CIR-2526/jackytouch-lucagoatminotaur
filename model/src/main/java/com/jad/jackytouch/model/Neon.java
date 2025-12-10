package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;
import com.jad.jackytouch.share.ICar;

public class Neon extends AbstractCarDecorator {

    public Neon(ICar car, IBehavior behavior) {
        super(car, behavior, "/neon.txt");
    }

    @Override
    protected String getTuningName() {
        return "Neons";
    }
}
