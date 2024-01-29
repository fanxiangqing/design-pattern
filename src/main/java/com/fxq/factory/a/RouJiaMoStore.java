package com.fxq.factory.a;

/**
 * 肉夹馍店铺
 */
public class RouJiaMoStore {
    private SimpleRouJiaMoFactory factory;

    public RouJiaMoStore(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type 肉夹馍类型
     * @return 肉夹馍
     */
    public RouJiaMo sellRouJiaMo(String type) {

        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);

        rouJiaMo.prepare().pack().fire();

        return rouJiaMo;
    }
}
