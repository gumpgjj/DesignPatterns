package com.megamind.creational.build;

import com.megamind.featuers.MailSender;
import com.megamind.featuers.SmsSender;
import com.megamind.interfaces.Sender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 17:18
 * Good Life One Day
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
