package com.megamind.structural.adapters.objectes;

import com.megamind.structural.adapters.classes.Source;
import com.megamind.structural.adapters.classes.Targetable;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 9:32
 * Good Life One Day
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method2() {
        source.method1();
    }
}
