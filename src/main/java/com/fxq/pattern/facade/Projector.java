package com.fxq.pattern.facade;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 投影仪
 */
public class Projector {

    public void on() {
        System.out.println("打开投影仪");
    }

    public void open() {
        System.out.println("放下投影仪投影区");
    }

    public void close() {
        System.out.println("收起投影仪投影区");
    }

    public void off() {
        System.out.println("关闭投影仪");
    }
}
