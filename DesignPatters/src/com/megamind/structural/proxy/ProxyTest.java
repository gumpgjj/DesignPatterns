package com.megamind.structural.adapters.proxy;

import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:06
 * Good Life One Day
 *
 * 我是中介 ，我代理你 给你找房子
 */
public class ProxyTest {
    @Test
    public void testProxy(){
        Sourceable sourceable = new Source();
        Sourceable sourceable1 = new Proxy(sourceable);
        sourceable1.method();
    }
}
