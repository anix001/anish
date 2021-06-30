package com.anish.day8;

public class PrototypeMain {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        System.out.println(circle);
    }
}
