package com.fxq.observer.jdk;

import lombok.Getter;

import java.util.Observable;

/**
 * 双色球主题
 */
@Getter
public class ObjectForSSQ extends Observable {

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
