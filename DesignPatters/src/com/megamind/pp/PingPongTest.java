package com.megamind.pp;

import org.junit.Test;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 16:28
 * Good Life One Day
 */
public class PingPongTest {
    @Test
    public void testPingPong() {
        PlayA playA = new PlayerAImpl();
        PlayB playB = new PlayerBImpl();
        for (int i = 0; i < 10000; i++) {
            playB.ping(playA,i);
        }
    }
}
