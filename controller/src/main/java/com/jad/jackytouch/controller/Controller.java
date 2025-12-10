package com.jad.jackytouch.controller;

import com.jad.jackytouch.model.Exhaust;
import com.jad.jackytouch.model.Neon;
import com.jad.jackytouch.model.Rims;
import com.jad.jackytouch.model.Spoiler;
import com.jad.jackytouch.model.behaviors.exhaust.Sport;
import com.jad.jackytouch.model.behaviors.neon.Disco;
import com.jad.jackytouch.model.behaviors.rims.Performance;
import com.jad.jackytouch.model.behaviors.spoiler.Aerodynamic;
import com.jad.jackytouch.share.*;

public class Controller implements IController {
    private IModel model;
    private IView view;

    @Override
    public void setModel(IModel model) {
        this.model = model;
    }

    @Override
    public void setView(IView view) {
        this.view = view;
    }

    @Override
    public void proceed() {
        view.displayCar(model.getCurrentCar());

        ICar car = new Spoiler(model.getCurrentCar(), new Aerodynamic());
        model.setCurrentCar(car);
        view.displayCar(model.getCurrentCar());

        car = new Neon(model.getCurrentCar(), new Disco());
        model.setCurrentCar(car);
        view.displayCar(model.getCurrentCar());

        car = new Rims(model.getCurrentCar(), new Performance());
        model.setCurrentCar(car);
        view.displayCar(model.getCurrentCar());

        car = new Exhaust(model.getCurrentCar(), new Sport());
        model.setCurrentCar(car);
        view.displayCar(model.getCurrentCar());
    }


    public void addSpoiler(IBehavior behavior) {
        ICar car = new Spoiler(model.getCurrentCar(), behavior);
        model.setCurrentCar(car);
        updateView();
    }

    public void addNeon(IBehavior behavior) {
        ICar car = new Neon(model.getCurrentCar(), behavior);
        model.setCurrentCar(car);
        updateView();
    }

    public void addRims(IBehavior behavior) {
        ICar car = new Rims(model.getCurrentCar(), behavior);
        model.setCurrentCar(car);
        updateView();
    }

    public void addExhaust(IBehavior behavior) {
        ICar car = new Exhaust(model.getCurrentCar(), behavior);
        model.setCurrentCar(car);
        updateView();
    }

    public void reset() {
        model.reset();
        updateView();
    }

    private void updateView() {
        ICar car = model.getCurrentCar();
        view.displayCar(car);
    }
}
