package com.anish.day5;

public class Main {
    public static void main(String[] args) {
//        Login login = new Facebook();
//        login.Process();
//        Justplayable(new Football());
        Outdoorgame outdoorgame = new Football();
        outdoorgame.play();
        outdoorgame.run();
        outdoorgame.strike();
    }
    public static  void Justplayable(Game game){
        game.play();
        game.run();
        game.strike();
    }
}
