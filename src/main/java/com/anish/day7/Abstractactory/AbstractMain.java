package com.anish.day7.Abstractactory;

import com.anish.com.anish.com.anish.day7.shapeExample.Shape;
import com.anish.com.anish.com.anish.day7.shapeExample.ShapeFactory;

public class AbstractMain {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = ProduceFactory.get("shape");
        Shape shape = ShapeFactory.getMethod("rectangle");
        System.out.println(shape.draw());
    }
}
