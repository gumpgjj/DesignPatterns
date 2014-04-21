package com.megamind.behavioral.middle.Mediator;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:31
 * Good Life One Day
 */
public class User2 extends User {
    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
