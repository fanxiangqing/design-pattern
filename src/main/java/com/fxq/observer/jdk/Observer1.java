package com.fxq.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者1
 */
public class Observer1 implements Observer {
    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ObjectFor3D) {
            System.out.printf("ObjectFor3D's msg ----> %s%n", ((ObjectFor3D) o).getMsg());
        } else if (o instanceof ObjectForSSQ) {
            System.out.printf("ObjectForSSQ's msg ----> %s%n", ((ObjectForSSQ) o).getMsg());
        }
    }
}
