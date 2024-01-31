package com.fxq.pattern.singleton.d;

/**
 * 懒汉式(线程安全，效率太低不推荐使用)
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton = null;

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
