package com.megamind.behavioral.pc.strategy;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:14
 * Good Life One Day
 */
public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
