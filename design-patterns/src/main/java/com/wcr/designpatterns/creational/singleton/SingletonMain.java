package com.wcr.designpatterns.creational.singleton;

import com.wcr.designpatterns.creational.singleton.impl.Singleton;

public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("************************");
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();
        System.out.println("singletonOne:" + singletonOne.getMessage());
        System.out.println("singletonTwo:" + singletonTwo.getMessage());
        System.out.println("************************");
        singletonOne.setMessage("Message added to show.");
        System.out.println("singletonOne:" + singletonOne.getMessage());
        System.out.println("singletonTwo:" + singletonTwo.getMessage());
        System.out.println("************************");
        Singleton singletonThree = Singleton.getInstance();
        System.out.println("singletonOne:" + singletonOne.getMessage());
        System.out.println("singletonTwo:" + singletonTwo.getMessage());
        System.out.println("singletonThree:" + singletonThree.getMessage());
        System.out.println("************************");
        singletonThree.setMessage("Message updated to show.");
        System.out.println("singletonOne:" + singletonOne.getMessage());
        System.out.println("singletonTwo:" + singletonTwo.getMessage());
        System.out.println("singletonThree:" + singletonThree.getMessage());
        System.out.println("************************");
    }
}
