package com.anish.day4;

public class Football extends Ball{
    @Override
    public void play() {
        color = "red";
        System.out.println("Playing " + color + " Football");
    }
}
