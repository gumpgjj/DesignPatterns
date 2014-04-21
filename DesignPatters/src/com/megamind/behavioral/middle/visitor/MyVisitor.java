package com.megamind.behavioral.middle.visitor;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:24
 * Good Life One Day
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
