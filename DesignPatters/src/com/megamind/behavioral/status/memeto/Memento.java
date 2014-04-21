package com.megamind.behavioral.status.memeto;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:10
 * Good Life One Day
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
