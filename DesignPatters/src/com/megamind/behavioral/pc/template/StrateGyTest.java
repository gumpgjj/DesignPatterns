package com.megamind.behavioral.pc.template;

import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:23
 * Good Life One Day
 */
public class StrategyTest {
    @Test
    public  void testStrategy(){
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
