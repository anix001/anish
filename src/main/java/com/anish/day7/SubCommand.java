package com.anish.day7;

public class SubCommand extends MathCommand{
    @Override
    public Double Calculation(Double x, Double y) {
        return x - y;
    }
}
