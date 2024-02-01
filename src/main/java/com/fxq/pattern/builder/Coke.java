package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 可口可乐
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 30.0F;
    }
}
