package com.megamind.behavioral.cc.observer;

import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:33
 * Good Life One Day
 */
public class ObserverTest {
    @Test
    public void testObserver(){
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
