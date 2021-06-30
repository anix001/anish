package com.anish.day7.AbstractFactoryExample;

import com.anish.day7.AbstractFactoryExample.Factoryproducer.FactoryProducer;
import com.anish.day7.AbstractFactoryExample.Factorytypes.AbstractFactory;
import com.anish.day7.AbstractFactoryExample.Shape.ShapeTypes;
import com.anish.day8.Shape;

public class FactoryMain {
    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = FactoryProducer.geFactories("shape");
        ShapeTypes shapeTypes = shapeFactory1.getShape("rectangle");
        shapeTypes.draw();
    }
}
