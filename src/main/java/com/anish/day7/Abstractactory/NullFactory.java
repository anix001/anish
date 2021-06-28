package com.anish.day7.Abstractactory;

import com.anish.com.anish.com.anish.day7.shapeExample.Shape;

public class NullFactory extends AbstractFactory{
    @Override
    protected Shape get(String Shape) {
        return null;
    }
}
