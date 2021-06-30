package com.anish.day7.AbstractFactoryExample.Shape;

public class Circle implements ShapeTypes {
    @Override
    public void draw() {
        System.out.println("Inside Circle");
    }
}
