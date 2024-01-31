package com.fxq.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 红宝石 15攻击力
 */
public class RedGemDecorator implements IEquipDecorator {

    private final IEquip equip;

    public RedGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int attack() {
        return 15 + equip.attack();
    }

    @Override
    public String description() {
        return equip.description() + " + 红宝石";
    }
}
