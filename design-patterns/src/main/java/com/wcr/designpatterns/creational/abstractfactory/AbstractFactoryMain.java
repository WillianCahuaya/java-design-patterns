package com.wcr.designpatterns.creational.abstractfactory;

import com.wcr.designpatterns.creational.abstractfactory.impl.db.ConnectionDB;
import com.wcr.designpatterns.creational.abstractfactory.impl.factory.ConnectionAbstractFactory;
import com.wcr.designpatterns.creational.abstractfactory.impl.factory.ProductFactory;
import com.wcr.designpatterns.creational.abstractfactory.impl.rest.ConnectionRest;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        System.out.println("************************");
        ConnectionAbstractFactory connectionDBAbstractFactory = ProductFactory.getConnection("DB");
        ConnectionDB oracleConnectionDB = connectionDBAbstractFactory.getConnectionDB("Oracle");
        oracleConnectionDB.start();
        oracleConnectionDB.stop();
        System.out.println("************************");
        ConnectionDB sqlConnectionDB = connectionDBAbstractFactory.getConnectionDB("SQL");
        sqlConnectionDB.start();
        sqlConnectionDB.stop();
        System.out.println("************************");
        ConnectionAbstractFactory connectionRestAbstractFactory = ProductFactory.getConnection("Rest");
        ConnectionRest saleConnectionRest = connectionRestAbstractFactory.getConnectionRest("Sale");
        saleConnectionRest.readUrl();
        System.out.println("************************");
        ConnectionRest buyConnectionRest = connectionRestAbstractFactory.getConnectionRest("Buy");
        buyConnectionRest.readUrl();
        System.out.println("************************");
    }
}
