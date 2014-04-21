package com.megamind.structural.adapters.classes;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 9:23
 * Good Life One Day
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println(this.getClass().getName()+"method2");
    }
}
