package com.anish.day7.AbstractFactoryExample.Factorytypes;

import com.anish.day7.AbstractFactoryExample.Color.Color;
import com.anish.day7.AbstractFactoryExample.Shape.ShapeTypes;

public interface AbstractFactory {
    Color getColor(String colorType);
    ShapeTypes getShape(String shapeType);
}
