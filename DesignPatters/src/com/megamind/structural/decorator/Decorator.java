package com.megamind.structural.adapters.decorator;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 9:51
 * Good Life One Day
 */
public class Decorator implements Sourceable {
    private  Sourceable sourceable;
    public  Decorator(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }
    @Override
    public void method() {
        System.out.println("before decorator");
        sourceable.method();
        System.out.println("after decorator");
    }
}
