package com.fxq.pattern.prototype;

/**
 * Created by xiangqing'fan on 2024/02/18
 */
public class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method .");
    }
}
