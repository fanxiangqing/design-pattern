package com.fxq.factory.c;

public class XianRouJiaMoStore extends RouJiaMoStore {

    @Override
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

        rouJiaMo.prepare(new XianRouJiaMoYLFactory()).pack().fire();

        return rouJiaMo;
    }
}
