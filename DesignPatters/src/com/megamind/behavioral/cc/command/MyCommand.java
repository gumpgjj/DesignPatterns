package com.megamind.behavioral.cc.command;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 13:03
 * Good Life One Day
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
