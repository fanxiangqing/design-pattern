package com.fxq.pattern.factory.b;

/**
 * 工厂方法模式
 */
public class Test {
    public static void main(String[] args) {
        XianRouJiaMoStore store = new XianRouJiaMoStore();
        RouJiaMo laRouJiaMo = store.sellRouJiaMo("La");
        System.out.println(laRouJiaMo.name);
    }
}
