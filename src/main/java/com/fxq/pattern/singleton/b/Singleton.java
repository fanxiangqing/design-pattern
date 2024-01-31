package com.fxq.pattern.singleton.b;

/**
 * 饿汉式，变换写法(可用)
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton = null;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
