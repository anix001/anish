package com.anish.day7.AbstractFactoryExample.Shape;

public class Rectangle implements ShapeTypes {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle");
    }
}
