package com.fxq.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 戒指 5攻击力
 */
public class RingEquip implements IEquip {
    @Override
    public int attack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
