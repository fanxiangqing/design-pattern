package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 素食汉堡
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public float price() {
        return 25.0F;
    }
}
