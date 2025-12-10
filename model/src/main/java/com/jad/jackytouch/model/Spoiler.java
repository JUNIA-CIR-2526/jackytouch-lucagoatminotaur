package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;
import com.jad.jackytouch.share.ICar;

public class Spoiler extends AbstractCarDecorator {

    public Spoiler(ICar car, IBehavior behavior) {
        super(car, behavior, "/spoiler.txt");
    }

    @Override
    protected String getTuningName() {
        return "Spoiler";
    }
}
