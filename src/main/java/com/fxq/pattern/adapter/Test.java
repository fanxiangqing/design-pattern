package com.fxq.pattern.adapter;

/**
 * Created by xiangqing'fan on 2024/01/29
 */
public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
