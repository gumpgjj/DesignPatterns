package com.megamind.train;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by gaojj
 * on 2014/4/18.
 * on 16:37
 * Good Life One Day
 */
public class RailWay {

    private final Train train = new Train();
    // stationNo追踪列车并定义哪个车站接收到了列车
    private final AtomicInteger stationIndex = new AtomicInteger();

    // 会有多个线程访问这个方法，并等待特定车站上的列车
    public Train waitTrainOnStation(final int stationNo) {

      /*  while (stationIndex.get() % stationCount != stationNo) {
            Thread.yield(); // 为保证高吞吐量的消息传递，这个是必须的。
            //但在等待列车时它会消耗CPU周期
        }*/
        // 只有站号等于stationIndex.get() % stationCount时，这个忙循环才会返回

        return train;
    }

    // 这个方法通过增加列车的站点索引将这辆列车移到下一站
    public void sendTrain() {
        stationIndex.getAndIncrement();
    }
}

