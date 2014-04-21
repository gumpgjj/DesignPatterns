package com.megamind.behavioral.cc.iterator;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:39
 * Good Life One Day
 */
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
