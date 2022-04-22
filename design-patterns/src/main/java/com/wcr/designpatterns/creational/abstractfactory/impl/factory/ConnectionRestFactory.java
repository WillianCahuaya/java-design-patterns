package com.wcr.designpatterns.creational.abstractfactory.impl.factory;

import com.wcr.designpatterns.creational.abstractfactory.impl.db.ConnectionDB;
import com.wcr.designpatterns.creational.abstractfactory.impl.rest.BuyConnectionRest;
import com.wcr.designpatterns.creational.abstractfactory.impl.rest.ConnectionRest;
import com.wcr.designpatterns.creational.abstractfactory.impl.rest.SaleConnectionRest;

public class ConnectionRestFactory implements ConnectionAbstractFactory {

    @Override
    public ConnectionRest getConnectionRest(String area) {
        switch (area) {
            case "Sale":
                return new SaleConnectionRest();
            case "Buy":
                return new BuyConnectionRest();
            default:
                return null;
        }
    }

    @Override
    public ConnectionDB getConnectionDB(String name) {
        return null;
    }

}
