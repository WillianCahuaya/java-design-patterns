package com.wcr.designpatterns.creational.factorymethod.impl.db;

public class OracleConnectionDB implements ConnectionDB {

    private String name;

    public OracleConnectionDB() {
        this.name = "Oracle";
    }

    @Override
    public void start() {
        System.out.println("Start Oracle Connection");
    }

    @Override
    public void stop() {
        System.out.println("Stop Oracle Connection");
    }

}
