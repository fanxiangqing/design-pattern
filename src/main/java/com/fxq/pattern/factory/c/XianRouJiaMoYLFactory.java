package com.fxq.pattern.factory.c;

/**
 * 根据西安当地特色, 提供这两种材料
 */
public class XianRouJiaMoYLFactory implements RouJiaMoYLFactory {
    @Override
    public Meat createMeat() {
        return new FreshMeat();
    }

    @Override
    public YuanLiao createYuanLiao() {
        return new XianTeSeYuanLiao();
    }

}
