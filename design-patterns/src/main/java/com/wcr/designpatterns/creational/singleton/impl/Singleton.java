package com.wcr.designpatterns.creational.singleton.impl;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Singleton {

    public static Singleton singleton;

    private String message;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }

}
