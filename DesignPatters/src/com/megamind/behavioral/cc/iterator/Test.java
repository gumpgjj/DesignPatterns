package com.megamind.behavioral.cc.iterator;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:40
 * Good Life One Day
 */
public class Test {
    @org.junit.Test
    public void test(){
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
