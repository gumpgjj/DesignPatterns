package com.megamind.behavioral.middle.interpreter;

/**
 * Created by Megamind
 * on 2014/4/21.
 * on 13:36
 * Good Life One Day
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
