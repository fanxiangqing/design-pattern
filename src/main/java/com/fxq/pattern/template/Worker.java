package com.fxq.pattern.template;

/**
 * Created by xiangqing'fan on 2024/01/31
 */
public abstract class Worker {

    protected final String name;

    public Worker(String name) {
        this.name = name;
    }

    /**
     * 记录一天的工作
     */
    public final void workOneDay() {
        System.out.println("-------------------- Work Start --------------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("--------------------  Work End  --------------------");
    }

    public abstract void work();

    public void enterCompany() {
        System.out.println(this.name + " 进入公司");
    }

    public void exitCompany() {
        System.out.println(this.name + " 离开公司");
    }

    public void computerOn() {
        System.out.println(this.name + " 打开电脑");
    }

    public void computerOff() {
        System.out.println(this.name + " 关闭电脑");
    }
}
