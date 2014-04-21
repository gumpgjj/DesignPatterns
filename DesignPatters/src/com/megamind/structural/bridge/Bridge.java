package com.megamind.structural.bridge;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:40
 * Good Life One Day
 */
public abstract class Bridge {
    private Sourceable sourceable;

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    public void method() {
        sourceable.method();
    }
}
