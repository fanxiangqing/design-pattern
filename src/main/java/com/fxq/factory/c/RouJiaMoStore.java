package com.fxq.factory.c;

public abstract class RouJiaMoStore {

    public abstract RouJiaMo createRouJiaMo(String type);

    public RouJiaMo sellRouJiaMo(String type) {
        return createRouJiaMo(type);
    }
}
