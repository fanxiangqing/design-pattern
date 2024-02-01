package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 冷饮
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
