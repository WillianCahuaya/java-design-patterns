package com.wcr.designpatterns.behavioral.strategy.impl;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.analyze();
    }

}
