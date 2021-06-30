package com.anish.day8;

public class Circle extends Shape{
    public Circle() {
        super();
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("This is a Circle.");
    }
}
