package com.megamind.behavioral.pc.strategy;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 11:11
 * Good Life One Day
 */
public  abstract  class AbstractCalculator {
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
