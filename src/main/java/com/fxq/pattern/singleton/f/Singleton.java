package com.fxq.pattern.singleton.f;

/**
 * 懒汉式(双检锁，建议使用)
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
