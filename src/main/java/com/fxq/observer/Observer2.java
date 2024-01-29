package com.fxq.observer;

/**
 * 观察者2
 */
public class Observer2 implements Observer {

    public Observer2(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.err.printf("observer2 得到 3D 号码  ----> %s%s%n", msg, ", 我要记下来");
    }
}
