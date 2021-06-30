package com.anish.day8;

public class ShapeFactory {
    //prototype

    public static Shape[] shapes = new Shape[]{
            new Circle(),
            new Rectangle()
    };

    public static Shape getShape(String type) {
        for (int i = 0; i <= shapes.length; i++) {
            if (shapes[i].getType().equals(type)) {
                return (Shape) shapes[i].clone();
            }
        }
        return null;
    }
}
