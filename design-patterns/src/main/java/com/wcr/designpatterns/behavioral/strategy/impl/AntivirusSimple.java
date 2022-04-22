package com.wcr.designpatterns.behavioral.strategy.impl;

public class AntivirusSimple extends SimpleStrategy {

    @Override
    public void start() {
        System.out.println("Start Antivirus Simple");
    }

    @Override
    void check() {
        System.out.println("Check Antivirus Simple");
    }

    @Override
    void stop() {
        System.out.println("Stop Antivirus Simple");
    }

}
