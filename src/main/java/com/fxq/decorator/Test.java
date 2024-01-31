package com.fxq.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 */
public class Test {

    public static void main(String[] args) {
        // 一个镶嵌了2颗红宝石，1颗蓝宝石的靴子
        System.out.println("一个镶嵌了2颗红宝石，1颗蓝宝石的靴子");
        IEquip shoeEquip = new BlueGemDecorator(new RedGemDecorator(new RedGemDecorator(new ShoeEquip())));
        System.out.println("攻击力  : " + shoeEquip.attack());
        System.out.println("描述 :" + shoeEquip.description());

        System.out.println("-------");

        // 一个镶嵌了1颗红宝石，2颗蓝宝石的武器
        System.out.println("一个镶嵌了1颗红宝石，2颗蓝宝石的武器");
        IEquip armEquip = new BlueGemDecorator(new BlueGemDecorator(new RedGemDecorator(new ArmEquip())));
        System.out.println("攻击力  : " + armEquip.attack());
        System.out.println("描述 :" + armEquip.description());
    }
}
