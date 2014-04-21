package com.megamind.behavioral.pc.strategy;

import org.junit.Test;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:15
 * Good Life One Day
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
 */
public class StrategyTest {

    @Test
    public void testStrategy(){
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
