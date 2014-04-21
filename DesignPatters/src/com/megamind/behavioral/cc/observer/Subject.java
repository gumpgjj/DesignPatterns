package com.megamind.behavioral.cc.observer;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:31
 * Good Life One Day
 */
public interface Subject {
    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}
