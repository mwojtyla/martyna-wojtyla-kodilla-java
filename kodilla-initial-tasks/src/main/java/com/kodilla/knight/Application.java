package com.kodilla.knight;

public class Application {
    public static void main (String[] args) {


        Knight knight = new Knight(new DeadIslandQuest());
        knight.operation();


    }
}
