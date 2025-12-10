package com.jad.jackytouch.model;

import com.jad.jackytouch.share.ICar;
import com.jad.jackytouch.share.IModel;

public class Model implements IModel {
    private final Car baseCar;
    private ICar currentCar;

    public Model() {
        this.baseCar = new Car();
        this.currentCar = baseCar;
    }

    public ICar getCurrentCar() {
        return currentCar;
    }
    
    public void setCurrentCar(ICar car) {
        this.currentCar = car;
    }

    public Car getBaseCar() {
        return baseCar;
    }

    public void reset() {
        this.currentCar = baseCar;
    }
}
