package com.fxq.pattern.builder;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 食品条目
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
