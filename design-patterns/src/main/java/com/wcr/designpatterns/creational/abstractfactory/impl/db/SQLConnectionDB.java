package com.wcr.designpatterns.creational.abstractfactory.impl.db;

public class SQLConnectionDB implements ConnectionDB {

    private String name;

    public SQLConnectionDB() {
        this.name = "SQL";
    }

    @Override
    public void start() {
        System.out.println("Start SQL Connection DB");
    }

    @Override
    public void stop() {
        System.out.println("Stop SQL Connection DB");
    }

}
