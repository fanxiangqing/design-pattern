package com.fxq.singleton.g;

/**
 * 内部类(推荐用)
 */
public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
