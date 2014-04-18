package com.megamind.pp;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 16:08
 * Good Life One Day
 */
public class PlayerBImpl implements PlayB {
    @Override
    public void ping(PlayA playA, long boll) {
        playA.pong(boll);
    }
}
