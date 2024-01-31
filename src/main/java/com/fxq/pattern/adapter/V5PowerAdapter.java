package com.fxq.pattern.adapter;

/**
 * Created by xiangqing'fan on 2024/01/29
 * 适配器 把 220V 电压变成 5V
 */
public class V5PowerAdapter implements V5Power {

    /**
     * 组合方式
     */
    private final V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provide220VPower();
        System.out.printf("适配器: 我悄悄适配了电压，将 %sV 变成了 5V%n", power);
        return 5;
    }
}
