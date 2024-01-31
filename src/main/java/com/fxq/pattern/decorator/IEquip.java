package com.fxq.pattern.decorator;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 装备的接口
 */
public interface IEquip {

    /**
     * 计算攻击力
     *
     * @return 攻击力
     */
    int attack();

    /**
     * 装备描述
     *
     * @return 装备描述
     */
    String description();
}
