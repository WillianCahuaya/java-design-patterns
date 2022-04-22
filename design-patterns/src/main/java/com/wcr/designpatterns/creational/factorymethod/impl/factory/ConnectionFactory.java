package com.wcr.designpatterns.creational.factorymethod.impl.factory;

import com.wcr.designpatterns.creational.factorymethod.impl.db.ConnectionDB;
import com.wcr.designpatterns.creational.factorymethod.impl.db.OracleConnectionDB;
import com.wcr.designpatterns.creational.factorymethod.impl.db.SQLConnectionDB;

public class ConnectionFactory {

    public static ConnectionDB getConnection(String name) {
        switch (name) {
            case "Oracle":
                return new OracleConnectionDB();
            case "SQL":
                return new SQLConnectionDB();
            default:
                return null;
        }
    }

}
