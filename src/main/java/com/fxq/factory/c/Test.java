package com.fxq.factory.c;

/**
 * 抽象工厂模式
 */
public class Test {
    public static void main(String[] args) {
        XianRouJiaMoStore store = new XianRouJiaMoStore();
        RouJiaMo tianRouJiaMo = store.sellRouJiaMo("Tian");
        System.out.println(tianRouJiaMo.name);
    }
}
