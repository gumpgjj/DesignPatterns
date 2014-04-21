package com.megamind.behavioral.cc.iterator;


/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:38
 * Good Life One Day
 */
public interface Collection {
    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
