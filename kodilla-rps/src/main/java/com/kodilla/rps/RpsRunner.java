package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        GameSteps game = new GameSteps();

        game.startOfTheGame();
        game.gameInstructions();
        game.gameRound();
        game.endOfTheGame();
        game.afterTheEnd();
        }
    }

