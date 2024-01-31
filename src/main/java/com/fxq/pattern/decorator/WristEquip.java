package com.fxq.pattern.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 护腕 5攻击力
 */
public class WristEquip implements IEquip {
    @Override
    public int attack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}
