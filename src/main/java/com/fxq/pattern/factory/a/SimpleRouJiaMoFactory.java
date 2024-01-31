package com.fxq.pattern.factory.a;

/**
 * 工厂
 */
public class SimpleRouJiaMoFactory {
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        switch (type) {
            case "Suan":
                rouJiaMo = new SuanRouJiaMo();
                break;
            case "La":
                rouJiaMo = new LaRouJiaMo();
                break;
            case "Tian":
                rouJiaMo = new TianRouJiaMo();
                break;
            default:
                throw new RuntimeException("没有此类型");
        }
        return rouJiaMo;
    }
}
