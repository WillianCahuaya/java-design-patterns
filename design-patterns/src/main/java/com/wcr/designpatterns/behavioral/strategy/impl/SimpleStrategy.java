package com.wcr.designpatterns.behavioral.strategy.impl;

public abstract class SimpleStrategy implements Strategy {

    @Override
    public void analyze() {
        start();
        check();
        stop();
    }

    abstract void start();

    abstract void check();

    abstract void stop();

}
