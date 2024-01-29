package com.fxq.singleton.a;

/**
 * 饿汉式(可用)
 */
public class Singleton {

    private Singleton() {

    }

    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }
}
