package com.megamind.structural.adapters.classes;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 9:19
 * Good Life One Day
 * 只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 */
public class Source {
    public void method1() {
        System.out.println(this.getClass().getName() + "method1");
    }
}
