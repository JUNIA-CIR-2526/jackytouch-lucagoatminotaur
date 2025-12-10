package com.jad.jackytouch.model.behaviors.neon;

import com.jad.jackytouch.share.IBehavior;

public class Random implements IBehavior {
    @Override
    public String getDescription() {
        return "Clignotement random";
    }

    @Override
    public String getName() {
        return "Random";
    }
}
