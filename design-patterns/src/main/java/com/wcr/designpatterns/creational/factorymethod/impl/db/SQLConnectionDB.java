package com.wcr.designpatterns.creational.factorymethod.impl.db;

public class SQLConnectionDB implements ConnectionDB {

    private String name;

    public SQLConnectionDB() {
        this.name = "SQL";
    }

    @Override
    public void start() {
        System.out.println("Start SQL Connection");
    }

    @Override
    public void stop() {
        System.out.println("Stop SQL Connection");
    }

}
