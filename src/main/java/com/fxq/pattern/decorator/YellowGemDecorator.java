package com.fxq.pattern.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 黄宝石 10攻击力
 */
public class YellowGemDecorator implements IEquipDecorator {

    private final IEquip equip;

    public YellowGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int attack() {
        return 10 + equip.attack();
    }

    @Override
    public String description() {
        return equip.description() + " + 黄宝石";
    }
}
