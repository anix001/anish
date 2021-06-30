package com.anish.day7.AbstractFactoryExample.Factorytypes;

import com.anish.day7.AbstractFactoryExample.Color.Blue;
import com.anish.day7.AbstractFactoryExample.Color.Color;
import com.anish.day7.AbstractFactoryExample.Color.Red;
import com.anish.day7.AbstractFactoryExample.Shape.ShapeTypes;

public class ColorFactory implements AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        switch (colorType){
            case "red":
                return new Red();
            case  "blue":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public ShapeTypes getShape(String shapeType) {
        return null;
    }
}
