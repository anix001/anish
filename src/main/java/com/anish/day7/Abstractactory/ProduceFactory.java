package com.anish.day7.Abstractactory;

import com.anish.com.anish.com.anish.day7.shapeExample.ShapeFactory;

public class ProduceFactory {
     public static  AbstractFactory get (String ShapeType){
         AbstractFactory abstractFactory = null;

         switch (ShapeType){
             case "shape":
                 abstractFactory = new ShapeFactory();
                 break;
             case  "round":
                 abstractFactory = new RoundedFactory();
                 break;
             default:
                 abstractFactory = new NullFactory();
         }
         return abstractFactory;
     }
}
