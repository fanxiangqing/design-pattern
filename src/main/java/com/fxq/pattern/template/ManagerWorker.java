package com.fxq.pattern.template;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 项目经理
 */
public class ManagerWorker extends Worker {

    public ManagerWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + " 打Dota...");
    }
}
