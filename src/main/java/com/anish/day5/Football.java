package com.anish.day5;

public class Football implements Outdoorgame {
    @Override
    public void play() {
        System.out.println("Hello i am playing football");
    }

    @Override
    public void strike() {
        System.out.println("Strike to get goal");
    }

    @Override
    public void run() {
        System.out.println("run in the game");
    }
}
