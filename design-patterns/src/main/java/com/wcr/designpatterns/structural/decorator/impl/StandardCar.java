package com.wcr.designpatterns.structural.decorator.impl;

public class StandardCar implements Car {

    private String name;

    public StandardCar(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Start Standard Car: " + name);
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up Standard Car: " + name);
    }

    @Override
    public void stop() {
        System.out.println("Stop Standard Car: " + name);
    }

}
