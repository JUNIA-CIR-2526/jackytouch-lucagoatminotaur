package com.jad.jackytouch.model.behaviors.exhaust;

import com.jad.jackytouch.share.IBehavior;

public class Silent implements IBehavior {
    @Override
    public String getDescription() {
        return "Silencieuse on l'entend pas carrément";
    }

    @Override
    public String getName() {
        return "Silent";
    }
}