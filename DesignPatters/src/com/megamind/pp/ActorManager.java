package com.megamind.pp;

import java.util.HashMap;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 16:09
 * Good Life One Day
 * actor 设计模式
 */
public class ActorManager {
    public static HashMap map = new HashMap();

    public void registerImpl(Class implClass) {
        map.put(implClass.getName(),implClass);
    }

    public void  createActor(Class interfaceClass) {

    }
}
