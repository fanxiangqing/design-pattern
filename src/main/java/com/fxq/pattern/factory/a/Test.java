package com.fxq.pattern.factory.a;

/**
 * 简单工厂模式
 */
public class Test {
    public static void main(String[] args) {
        RouJiaMoStore store = new RouJiaMoStore(new SimpleRouJiaMoFactory());
        RouJiaMo laRouJiaMo = store.sellRouJiaMo("La");
        System.out.println(laRouJiaMo.name);
        RouJiaMo tianRouJiaMo = store.sellRouJiaMo("Tian");
        System.out.println(tianRouJiaMo.name);
    }
}
