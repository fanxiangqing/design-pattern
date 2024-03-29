package com.fxq.pattern.facade;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 播放器
 */
public class Player {

    public void on() {
        System.out.println("打开播放器");
    }

    public void make3DListener() {
        System.out.println("将播放器音调设为环绕立体声");
    }

    public void off() {
        System.out.println("关闭播放器");
    }
}
