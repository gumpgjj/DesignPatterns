package com.megamind.structural.adapters.classes;

import org.junit.Test;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 9:24
 * Good Life One Day
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 */
public class AdapterTest {
    @Test
    public void testAdapter(){
        Targetable targetable  = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
