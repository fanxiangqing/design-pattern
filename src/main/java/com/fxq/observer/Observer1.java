package com.fxq.observer;

/**
 * 观察者1
 */
public class Observer1 implements Observer {

    public Observer1(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.printf("observer1 得到 3D 号码  ----> %s%s%n", msg, ", 我要记下来");
    }
}
