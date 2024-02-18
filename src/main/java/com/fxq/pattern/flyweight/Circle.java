package com.fxq.pattern.flyweight;

/**
 * Created by xiangqing'fan on 2024/02/18
 */
public class Circle implements Shape {

    private Integer x, y, radius;
    private String color;


    public Circle(String color) {
        this.color = color;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw() [Color: " +
                this.color +
                ", x: " +
                this.x +
                ", y: " +
                this.y +
                ", radius: " +
                this.radius);
    }
}
