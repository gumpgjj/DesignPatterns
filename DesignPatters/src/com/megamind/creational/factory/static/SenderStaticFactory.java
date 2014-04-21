package com.megamind.creational;

import com.megamind.featuers.MailSender;
import com.megamind.featuers.SmsSender;
import com.megamind.interfaces.Sender;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 9:30
 * Good Life One Day
 */
public class SenderStaticFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
