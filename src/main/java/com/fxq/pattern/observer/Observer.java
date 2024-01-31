package com.fxq.pattern.observer;

/**
 * 所有潜在的观察者必须实现观察者接口
 * 当主题状态改变时 update 被调用
 */
public interface Observer {

    void update(String msg);
}
