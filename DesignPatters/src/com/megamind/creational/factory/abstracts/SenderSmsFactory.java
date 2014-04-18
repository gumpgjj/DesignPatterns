package com.megamind.creational.factory.abstracts;

import com.megamind.featuers.SmsSender;
import com.megamind.interfaces.Provider;
import com.megamind.interfaces.Sender;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 9:54
 * Good Life One Day
 */
public class SenderSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
