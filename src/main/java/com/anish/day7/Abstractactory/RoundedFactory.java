package com.anish.day7.Abstractactory;

import com.anish.com.anish.com.anish.day7.shapeExample.Circle;
import com.anish.com.anish.com.anish.day7.shapeExample.Null;
import com.anish.com.anish.com.anish.day7.shapeExample.Shape;
import com.anish.com.anish.com.anish.day7.shapeExample.round;

public class RoundedFactory extends AbstractFactory {
    @Override
    public Shape get(String Shape) {
    Shape shape = null;
    switch (Shape){
        case "circle":
            shape = new Circle();
            break;
        case "round":
            shape = new round();
            break;
        default:
            shape = new Null();
            break;
    }
    return shape;
    }


}
