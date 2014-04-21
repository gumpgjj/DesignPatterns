package com.megamind.behavioral.cc.iterator;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:39
 * Good Life One Day
 */
public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
