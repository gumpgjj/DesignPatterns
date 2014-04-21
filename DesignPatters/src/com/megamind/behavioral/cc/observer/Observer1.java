package com.megamind.behavioral.cc.observer;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:29
 * Good Life One Day
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("the observer1 has received!");
    }
}
