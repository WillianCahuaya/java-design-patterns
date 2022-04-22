package com.wcr.designpatterns.behavioral.strategy.impl;

public class AntivirusAdvance extends AdvanceStrategy {


    @Override
    void start() {
        System.out.println("Start Antivirus Advance");
    }

    @Override
    void checkMemory() {
        System.out.println("Check memory Antivirus Advance");
    }

    @Override
    void checkDisk() {
        System.out.println("Check Disk Antivirus Advance");
    }

    @Override
    void checkFiles() {
        System.out.println("Check files Antivirus Advance");
    }

    @Override
    void stop() {
        System.out.println("Stop Antivirus Advance");
    }

}
