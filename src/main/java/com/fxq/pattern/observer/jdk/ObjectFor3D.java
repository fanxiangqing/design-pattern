package com.fxq.pattern.observer.jdk;

import lombok.Getter;

import java.util.Observable;

/**
 * 3D 服务号主题
 */
@Getter
public class ObjectFor3D extends Observable {

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
