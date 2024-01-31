package com.fxq.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 3D 服务号(主题)
 */
public class ObjectFor3D implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
