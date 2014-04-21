package com.megamind.structural.facade;

import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:27
 * Good Life One Day
 * 类和类之间的 耦合度
 */
public class User {
    @Test
    public void testUser(){
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
