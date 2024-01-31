package com.fxq.pattern.template;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 测试人员
 */
public class QAWorker extends Worker {

    public QAWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + " 写测试用例-提交Bug-写测试用例");
    }
}
