package com.megamind.behavioral.middle.Mediator;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:30
 * Good Life One Day
 */
public  abstract  class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
