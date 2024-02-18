package com.fxq.pattern.prototype;

/**
 * Created by xiangqing'fan on 2024/02/18
 */
public class Square extends Shape {

    public Square() {
        this.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method .");
    }
}
