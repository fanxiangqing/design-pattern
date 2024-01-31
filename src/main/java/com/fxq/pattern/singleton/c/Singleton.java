package com.fxq.pattern.singleton.c;

/**
 * 懒汉式(不可用，线程不安全)
 */
public class Singleton {
    private Singleton() {

    }

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
