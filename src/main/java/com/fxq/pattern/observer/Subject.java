package com.fxq.pattern.observer;

/**
 * 主题接口
 * 对象使用此接口注册为观察者或者把自己从观察者中删除
 */
public interface Subject {

    /**
     * 注册一个观察者
     *
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer 观察者
     */
    void removerObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
