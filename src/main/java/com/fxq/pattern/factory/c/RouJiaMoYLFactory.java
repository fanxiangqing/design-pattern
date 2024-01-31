package com.fxq.pattern.factory.c;

/**
 * 提供肉夹馍原料
 */
public interface RouJiaMoYLFactory {

    /**
     * 生产肉
     *
     * @return 肉
     */
    Meat createMeat();

    /**
     * 生产调料什么的
     *
     * @return 调料
     */
    YuanLiao createYuanLiao();

}
