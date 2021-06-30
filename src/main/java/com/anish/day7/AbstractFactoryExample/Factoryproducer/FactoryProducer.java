package com.anish.day7.AbstractFactoryExample.Factoryproducer;

import com.anish.day7.AbstractFactoryExample.Factorytypes.AbstractFactory;
import com.anish.day7.AbstractFactoryExample.Factorytypes.ColorFactory;
import com.anish.day7.AbstractFactoryExample.Factorytypes.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory geFactories(String factoryType){
        switch (factoryType){
            case "shape":
                return new ShapeFactory();
            case "color":
                return  new ColorFactory();
            default:
                return null;
        }
    }
}
