package com.megamind.train;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 16:38
 * Good Life One Day
 */
public class Train {
    // 运载能力
    public static int CAPACITY = 2*1024;

    private final long[] goodsArray; // 传输运输货物的数组

    private int index;

    public Train() {
        goodsArray = new long[CAPACITY];
    }

    public int goodsCount() { //返回货物数量
        return index;
    }
    public void addGoods(long i) { // 向列车中添加条目 上车的人
        goodsArray[index++] = i;
    }
    public long getGoods(int i) { //从列车中移走条目 下车的人
        index--;
        return goodsArray[i];
    }
}
