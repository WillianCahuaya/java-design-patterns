package com.wcr.designpatterns.creational.abstractfactory.impl.db;

public class OracleConnectionDB implements ConnectionDB {

    private String name;

    public OracleConnectionDB() {
        this.name = "Oracle";
    }

    @Override
    public void start() {
        System.out.println("Start Oracle Connection DB");
    }

    @Override
    public void stop() {
        System.out.println("Stop Oracle Connection DB");
    }

}
