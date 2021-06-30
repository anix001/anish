package com.anish.day7.AbstractFactoryExample.Factorytypes;

import com.anish.day7.AbstractFactoryExample.Color.Color;
import com.anish.day7.AbstractFactoryExample.Shape.Circle;
import com.anish.day7.AbstractFactoryExample.Shape.Rectangle;
import com.anish.day7.AbstractFactoryExample.Shape.ShapeTypes;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public ShapeTypes getShape(String shapeType) {
        switch (shapeType){
            case "rectangle":
                return  new Rectangle();
            case "circle":
                return new Circle();
            default:
                return null;
        }
    }
}
