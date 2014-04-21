package com.megamind.behavioral.middle.visitor;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:25
 * Good Life One Day
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
