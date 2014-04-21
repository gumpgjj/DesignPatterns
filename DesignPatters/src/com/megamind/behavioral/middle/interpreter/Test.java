package com.megamind.behavioral.middle.interpreter;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:37
 * Good Life One Day
 */
public class Test {
    @org.junit.Test
    public void test(){
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
