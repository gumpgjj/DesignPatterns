package com.megamind.structural.adapters.proxy;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:03
 * Good Life One Day
 */
public class Proxy implements Sourceable {
    private Sourceable source;

    public Proxy(Sourceable sourceable) {
        super();
        source = sourceable;
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy");
    }

    private void before() {
        System.out.println("before proxy");
    }
}
