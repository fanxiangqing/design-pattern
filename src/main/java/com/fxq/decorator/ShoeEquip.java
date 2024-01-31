package com.fxq.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 鞋子 5攻击力
 */
public class ShoeEquip implements IEquip {
    @Override
    public int attack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战靴子";
    }
}
