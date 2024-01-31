package com.fxq.pattern.template;

/**
 * Created by xiangqing'fan on 2024/01/31
 * HR
 */
public class HRWorker extends Worker {
    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + " 看简历-打电话-接电话");
    }
}
