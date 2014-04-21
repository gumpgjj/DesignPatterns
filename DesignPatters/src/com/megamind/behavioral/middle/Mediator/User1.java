package com.megamind.behavioral.middle.Mediator;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:31
 * Good Life One Day
 */
public class User1 extends User {
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
