package com.wcr.designpatterns.behavioral.strategy.impl;

public abstract class AdvanceStrategy implements Strategy {

    @Override
    public void analyze() {
        start();
        checkMemory();
        checkDisk();
        checkFiles();
        stop();
    }

    abstract void start();

    abstract void checkMemory();

    abstract void checkDisk();

    abstract void checkFiles();

    abstract void stop();

}
