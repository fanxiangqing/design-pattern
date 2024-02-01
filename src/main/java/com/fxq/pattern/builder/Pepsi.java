package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 百事可乐
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 35.0F;
    }
}
