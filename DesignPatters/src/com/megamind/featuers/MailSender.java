package com.megamind.featuers;

import com.megamind.interfaces.Sender;

/**
 * Created by gaojj
 * on 2014/4/17.
 * on 13:31
 * Good Life One Day
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println(this.getClass().getName());
    }
}
