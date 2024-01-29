package com.fxq.observer;

/**
 * 一个具体主题， 实现主题
 * 除了注册和撤销方法之外，具体主题还实现了 notifyObserver() 方法，此方法用于在状态改变时更新所有当前观察者
 */
public class ConcreteSubject implements Subject {
    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void removerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
