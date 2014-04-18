package com.megamind.creational;

import com.megamind.featuers.MailSender;
import com.megamind.featuers.SmsSender;
import com.megamind.interfaces.Sender;

/**
 * Created by gaojj
 * on 2014/4/17.
 * on 13:32
 * Good Life One Day
 */
public class SenderFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return  new MailSender();
        } else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型");
            return  null;
        }
    }
}
