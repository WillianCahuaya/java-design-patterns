package com.wcr.designpatterns.structural.decorator.impl;

public class MechanicFeatureCar extends CarDecorator {

    public MechanicFeatureCar(Car car){
        super(car);
    }

    @Override
    public void start() {
        System.out.println("Before Start Mechanic Feature Car");
        getCar().start();
        System.out.println("After Start Mechanic Feature Car");
    }

    @Override
    public void speedUp() {
        System.out.println("Before Speed Up Mechanic Feature Car");
        getCar().speedUp();
    }

    @Override
    public void stop() {
        getCar().stop();
        System.out.println("After Stop Mechanic Feature Car");
    }

}
