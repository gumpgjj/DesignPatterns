package com.megamind.test;

import com.megamind.creational.SenderFactory;
import com.megamind.creational.SenderStaticFactory;
import com.megamind.interfaces.Sender;

import java.util.Random;

/**
 * Created by gaojj
 * on 2014/4/17.
 * on 13:35
 * Good Life One Day
 */
public class SenderFactoryTest {
    public static void main(String args[]) {
        SenderFactory senderFactory = new SenderFactory();
        SenderStaticFactory senderStaticFactory = new SenderStaticFactory();
        for (int i = 0; i < 20; i++) {
            System.out.print(i);
            Sender sender = null;
            Sender sender1 =null;
            Random random = new Random();
            int randomInt = random.nextInt();
            if (randomInt % 2 == 0) {
                sender = senderFactory.produce("mail");
                sender1 = senderStaticFactory.produceSms();
            } else {
                sender = senderFactory.produce("sms");
                sender1 = senderStaticFactory.produceMail();
            }
            sender.send();
            sender1.send();
        }
    }
}
