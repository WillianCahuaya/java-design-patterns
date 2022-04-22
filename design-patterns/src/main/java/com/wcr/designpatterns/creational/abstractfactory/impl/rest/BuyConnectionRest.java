package com.wcr.designpatterns.creational.abstractfactory.impl.rest;

public class BuyConnectionRest implements ConnectionRest {

    private String name;

    public BuyConnectionRest() {
        this.name = "Buy";
    }

    @Override
    public void readUrl() {
        System.out.println("Read Url Buy Connection Rest");
    }

}
