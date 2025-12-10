package com.jad.jackytouch.model.behaviors.spoiler;

import com.jad.jackytouch.share.IBehavior;

public class Aerodynamic implements IBehavior {
    @Override
    public String getDescription() {
        return "Stabilité accrue";
    }

    @Override
    public String getName() {
        return "Aerodynamic";
    }
}