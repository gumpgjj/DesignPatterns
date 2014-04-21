package com.megamind.behavioral.cc.observer;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:32
 * Good Life One Day
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("i observer some changes");
        notifyObservers();
    }
}
