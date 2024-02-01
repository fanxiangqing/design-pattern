package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.5F;
    }
}
