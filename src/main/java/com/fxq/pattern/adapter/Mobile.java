package com.fxq.pattern.adapter;

/**
 * Created by xiangqing'fan on 2024/01/29
 */
public class Mobile {

    /**
     * 充电
     * @param power 电源
     */
    public void inputPower(V5Power power) {
        int provideV5Power = power.provideV5Power();
        System.out.printf("手机(客户端): 我需要 5V 电压充电，现在是 ---> %s V%n", provideV5Power);
    }
}
