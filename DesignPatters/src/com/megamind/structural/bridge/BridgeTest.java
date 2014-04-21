package com.megamind.structural.bridge;

import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:43
 * Good Life One Day
 * 将接口和实现解耦，使得二者可以独立变化
 */
public class BridgeTest {
    @Test
    public void testBridge() {
        Bridge bridge = new MyBridge();
        Sourceable sourceable  =new SourceSub1();
        bridge.setSourceable(sourceable);
        bridge.method();
        sourceable = new SourceSub2();
        bridge.setSourceable(sourceable);
        bridge.method();
    }
}
