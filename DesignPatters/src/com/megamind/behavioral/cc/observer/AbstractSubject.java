package com.megamind.behavioral.cc.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:31
 * Good Life One Day
 * 观察变化
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}
