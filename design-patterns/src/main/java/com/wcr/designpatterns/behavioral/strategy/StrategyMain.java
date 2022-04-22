package com.wcr.designpatterns.behavioral.strategy;

import com.wcr.designpatterns.behavioral.strategy.impl.AntivirusAdvance;
import com.wcr.designpatterns.behavioral.strategy.impl.AntivirusSimple;
import com.wcr.designpatterns.behavioral.strategy.impl.Context;

public class StrategyMain {

    public static void main(String[] args) {
        System.out.println("************************");
        Context antivirusSimple = new Context(new AntivirusSimple());
        antivirusSimple.run();
        System.out.println("************************");
        Context antivirusAdvance = new Context(new AntivirusAdvance());
        antivirusAdvance.run();
        System.out.println("************************");
    }

}
