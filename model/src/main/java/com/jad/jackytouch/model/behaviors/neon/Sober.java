package com.jad.jackytouch.model.behaviors.neon;

import com.jad.jackytouch.share.IBehavior;

public class Sober implements IBehavior {
    @Override
    public String getDescription() {
        return "Elle a pas bu";
    }

    @Override
    public String getName() {
        return "Sober";
    }
}