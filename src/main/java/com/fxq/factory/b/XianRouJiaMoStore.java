package com.fxq.factory.b;

/**
 * 西安肉夹馍店铺
 */
public class XianRouJiaMoStore extends RouJiaMoStore {
    public XianRouJiaMoStore() {
        System.out.println("欢迎光临西安肉夹馍");
    }

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
        return rouJiaMo;
    }
}
