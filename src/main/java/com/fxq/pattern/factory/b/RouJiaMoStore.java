package com.fxq.pattern.factory.b;


/**
 * 肉夹馍店铺
 */
public abstract class RouJiaMoStore {

    public abstract RouJiaMo createRouJiaMo(String type);

    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = createRouJiaMo(type);
        rouJiaMo.prepare().pack().fire();
        return rouJiaMo;
    }
}
