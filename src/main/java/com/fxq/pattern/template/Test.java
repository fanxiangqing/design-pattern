package com.fxq.pattern.template;

/**
 * Created by xiangqing'fan on 2024/01/31
 */
public class Test {
    public static void main(String[] args) {
        Worker it1 = new ITWorker("小明");
        it1.workOneDay();

        Worker it2 = new ITWorker("小军");
        it2.workOneDay();

        Worker hr = new HRWorker("迪迪");
        hr.workOneDay();

        Worker qa = new QAWorker("老李");
        qa.workOneDay();

        Worker pm = new ManagerWorker("老孙");
        pm.workOneDay();
    }
}
