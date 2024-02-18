package com.fxq.pattern.proxy;

/**
 * Created by xiangqing'fan on 2024/02/18
 */
public class Test {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_01mb.jpg");

        // 图像从磁盘加载
        image.display();

        System.out.println("=================");
        // 图像不需要从磁盘加载
        image.display();
    }
}
