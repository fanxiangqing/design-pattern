package com.fxq.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 武器 20攻击力
 */
public class ArmEquip implements IEquip {

    @Override
    public int attack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
