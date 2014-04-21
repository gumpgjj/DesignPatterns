package com.megamind.behavioral.status.memeto;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:10
 * Good Life One Day
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
