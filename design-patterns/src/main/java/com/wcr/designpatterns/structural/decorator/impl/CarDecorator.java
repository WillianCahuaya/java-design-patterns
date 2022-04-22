package com.wcr.designpatterns.structural.decorator.impl;

import lombok.Getter;

@Getter
public abstract class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

}
