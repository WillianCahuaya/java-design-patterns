package com.wcr.designpatterns.creational.abstractfactory.impl.factory;

public class ProductFactory {

    public static ConnectionAbstractFactory getConnection(String factoryType) {
        switch (factoryType) {
            case "DB":
                return new ConnectionDBFactory();
            case "Rest":
                return new ConnectionRestFactory();
            default:
                return null;
        }
    }

}
