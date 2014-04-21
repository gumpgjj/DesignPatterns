package com.megamind.behavioral.cc.chain;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:44
 * Good Life One Day
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
