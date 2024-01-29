package com.fxq.factory.c;

public abstract class RouJiaMo {

    protected String name;

    /**
     * 准备工作
     *
     * @param ylFactory 原料工厂
     */
    public final RouJiaMo prepare(RouJiaMoYLFactory ylFactory) {
        Meat meat = ylFactory.createMeat();
        YuanLiao yuanLiao = ylFactory.createYuanLiao();
        System.out.printf("使用官方的原料: %s, %s, 作为原材料制作肉夹馍%n", meat, yuanLiao);
        return this;
    }

    /**
     * 使用你们的专用袋-包装
     */
    public final RouJiaMo pack() {
        System.out.println("肉夹馍-专用袋-包装");
        return this;
    }

    /**
     * 秘制设备-烘烤 2 分钟
     */
    public final void fire() {
        System.out.println("肉夹馍-专用设备-烘烤");
    }
}
