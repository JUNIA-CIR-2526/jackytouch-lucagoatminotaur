package com.jad.jackytouch.model.behaviors.spoiler;

import com.jad.jackytouch.share.IBehavior;

public class Aesthetic implements IBehavior {
    @Override
    public String getDescription() {
        return "Pas d'effets mécanique";
    }

    @Override
    public String getName() {
        return "Aesthetic";
    }
}