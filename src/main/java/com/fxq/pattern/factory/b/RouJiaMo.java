package com.fxq.pattern.factory.b;

/**
 * 肉夹馍
 */
public abstract class RouJiaMo {

    protected String name;

    /**
     * 准备工作
     */
    public RouJiaMo prepare() {
        System.out.println("揉面-剁肉-完成准备工作");
        return this;
    }

    /**
     * 使用你们的专用包装袋
     */
    public RouJiaMo pack() {
        System.out.println("肉夹馍-专用袋-包装");
        return this;
    }

    /**
     * 秘制设备-烘烤 2 分钟
     */
    public void fire() {
        System.out.println("肉夹馍-专用设备-烘烤");
    }
}
