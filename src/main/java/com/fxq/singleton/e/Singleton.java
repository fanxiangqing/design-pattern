package com.fxq.singleton.e;

/**
 * 懒汉式(不可用线程不安全)
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
