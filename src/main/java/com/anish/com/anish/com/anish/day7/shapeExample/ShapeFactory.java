package com.anish.com.anish.com.anish.day7.shapeExample;

import com.anish.day7.Abstractactory.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

    public static  Shape getMethod(String Shape){
        Shape shape = null;

        switch (Shape){
            case  "rectangle":
                shape = new Rectangle();
                break;
            case "square":
                shape = new Square();
                break;
            default:
                shape = new Null();
                break;
        }
        return  shape;
    }

    @Override
    protected Shape get(String Shape) {
        return null;
    }
}
