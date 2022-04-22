package com.wcr.designpatterns.creational.abstractfactory.impl.factory;

import com.wcr.designpatterns.creational.abstractfactory.impl.db.ConnectionDB;
import com.wcr.designpatterns.creational.abstractfactory.impl.db.OracleConnectionDB;
import com.wcr.designpatterns.creational.abstractfactory.impl.db.SQLConnectionDB;
import com.wcr.designpatterns.creational.abstractfactory.impl.rest.ConnectionRest;

public class ConnectionDBFactory implements ConnectionAbstractFactory {

    @Override
    public ConnectionDB getConnectionDB(String name) {
        switch (name) {
            case "Oracle":
                return new OracleConnectionDB();
            case "SQL":
                return new SQLConnectionDB();
            default:
                return null;
        }
    }

    @Override
    public ConnectionRest getConnectionRest(String area) {
        return null;
    }

}
