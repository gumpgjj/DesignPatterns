package com.megamind.creational.factory.abstracts;


import com.megamind.featuers.MailSender;
import com.megamind.interfaces.Provider;
import com.megamind.interfaces.Sender;

public  class  SenderMailFactory implements Provider{

    @Override
    public Sender produce() {
        return new MailSender();
    }
}