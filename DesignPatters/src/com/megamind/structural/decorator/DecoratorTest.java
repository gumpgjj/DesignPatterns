package com.megamind.structural.adapters.decorator;

import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 9:54
 * Good Life One Day
 *  你把你的给我 ，我实现你的接口  ，包装你
 */
public class DecoratorTest {

    @Test
    public void testDecorator(){
        Sourceable sourceable  = new Source();
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();
    }
}
