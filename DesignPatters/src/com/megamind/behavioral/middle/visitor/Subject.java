package com.megamind.behavioral.middle.visitor;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:24
 * Good Life One Day
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
