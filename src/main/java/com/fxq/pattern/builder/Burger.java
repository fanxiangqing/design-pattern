package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 汉堡
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
