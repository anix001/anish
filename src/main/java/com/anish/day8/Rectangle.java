package com.anish.day8;

public class Rectangle extends Shape{
    public Rectangle() {
        super();
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("This is a rectangle");
    }
}
