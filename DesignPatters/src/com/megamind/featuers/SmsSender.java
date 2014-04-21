package com.megamind.featuers;

import com.megamind.interfaces.Sender;

/**
 * Created by gaojj
 * on 2014/4/17.
 * on 13:32
 * Good Life One Day
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println(this.getClass().getName());
    }
}
