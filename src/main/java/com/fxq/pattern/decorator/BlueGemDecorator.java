package com.fxq.pattern.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 蓝宝石 5攻击力
 */
public class BlueGemDecorator implements IEquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */

    private final IEquip equip;

    public BlueGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int attack() {
        return 5 + equip.attack();
    }

    @Override
    public String description() {
        return equip.description() + " + 蓝宝石";
    }
}
