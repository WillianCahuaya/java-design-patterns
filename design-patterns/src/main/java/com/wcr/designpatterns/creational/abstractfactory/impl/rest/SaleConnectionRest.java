package com.wcr.designpatterns.creational.abstractfactory.impl.rest;

public class SaleConnectionRest implements ConnectionRest {

    private String area;

    public SaleConnectionRest() {
        this.area = "Sale";
    }

    @Override
    public void readUrl() {
        System.out.println("Read Url Sale Connection Rest");
    }

}
