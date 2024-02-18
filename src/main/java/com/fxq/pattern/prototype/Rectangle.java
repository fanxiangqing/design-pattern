package com.fxq.pattern.prototype;

/**
 * Created by xiangqing'fan on 2024/02/18
 */
public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method .");
    }
}
