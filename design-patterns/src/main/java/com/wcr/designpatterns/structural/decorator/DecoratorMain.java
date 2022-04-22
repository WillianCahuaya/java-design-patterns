package com.wcr.designpatterns.structural.decorator;

import com.wcr.designpatterns.structural.decorator.impl.MechanicFeatureCar;
import com.wcr.designpatterns.structural.decorator.impl.StandardCar;

public class DecoratorMain {

    public static void main(String[] args) {
        System.out.println("************************");
        StandardCar standardCar = new StandardCar("Nissan");
        standardCar.start();
        standardCar.speedUp();
        standardCar.stop();
        System.out.println("************************");
        MechanicFeatureCar mechanicFeatureCar = new MechanicFeatureCar(new StandardCar("Mitsubishi"));
        mechanicFeatureCar.start();
        mechanicFeatureCar.speedUp();
        mechanicFeatureCar.stop();
        System.out.println("************************");
    }

}
