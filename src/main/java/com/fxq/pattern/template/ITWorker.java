package com.fxq.pattern.template;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 程序员
 */
public class ITWorker extends Worker {

    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + " 写程序-测Bug-fix Bug");
    }
}
