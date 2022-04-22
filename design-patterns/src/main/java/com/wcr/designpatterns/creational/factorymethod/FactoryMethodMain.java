package com.wcr.designpatterns.creational.factorymethod;

import com.wcr.designpatterns.creational.factorymethod.impl.db.ConnectionDB;
import com.wcr.designpatterns.creational.factorymethod.impl.factory.ConnectionFactory;

public class FactoryMethodMain {

    public static void main(String[] args) {
        System.out.println("************************");
        ConnectionDB oracleConnectionDB = ConnectionFactory.getConnection("Oracle");
        oracleConnectionDB.start();
        oracleConnectionDB.stop();
        System.out.println("************************");
        ConnectionDB sqlConnectionDB = ConnectionFactory.getConnection("SQL");
        sqlConnectionDB.start();
        sqlConnectionDB.stop();
        System.out.println("************************");
    }

}

