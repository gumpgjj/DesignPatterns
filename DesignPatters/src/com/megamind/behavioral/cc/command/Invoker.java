package com.megamind.behavioral.cc.command;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:49
 * Good Life One Day
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
