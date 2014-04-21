package com.megamind.creational.factory.example;


import com.megamind.ben.Sample;
import com.megamind.ben.Sample2;

/**
 * Created by Administrator on 2014/4/17.
 */
public abstract class Factory {
    public abstract Sample createSample();
    public abstract Sample2 createSample2();
}
