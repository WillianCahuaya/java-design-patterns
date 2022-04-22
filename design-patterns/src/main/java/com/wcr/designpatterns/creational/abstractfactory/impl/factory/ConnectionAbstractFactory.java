package com.wcr.designpatterns.creational.abstractfactory.impl.factory;

import com.wcr.designpatterns.creational.abstractfactory.impl.db.ConnectionDB;
import com.wcr.designpatterns.creational.abstractfactory.impl.rest.ConnectionRest;

public interface ConnectionAbstractFactory {

    ConnectionDB getConnectionDB(String name);

    ConnectionRest getConnectionRest(String area);

}
