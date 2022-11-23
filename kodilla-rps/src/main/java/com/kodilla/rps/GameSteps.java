package com.kodilla.rps;

import java.util.Scanner;

public class GameSteps {
    private String userName;
    private int userNumberOfRounds;
    private int totalRoundsWon;
    private int totalRoundsCounter;
    private int userMove;
    private int computerMove;
    private int userScores;
    private int computerScores;
    private String userEndMove;
    private String userChoice;
    private String userChoice2;


    public void startOfTheGame() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi! You are playing the game PAPER-ROCK-SCISSORS!" + "\n" + "What is your name?");
        userName = scan.nextLine();

        System.out.println("To how many won rounds do you want to play?");
        userNumberOfRounds = scan.nextInt();
    }

    public void gameInstructions() {
        System.out.println("Here are the game instructions: " + "\n"
                + "Button '1': play ROCK" + "\n"
                + "Button '2': play PAPER" + "\n"
                + "Button '3': play SCISSORS" + "\n"
                + "Button 'x': end of the game" + "\n"
                + "Button 'n': start again" + "\n");
    }

    public void gameRound() {
        totalRoundsCounter = 1;
        totalRoundsWon = 0;
        userScores = 0;
        computerScores = 0;
        boolean end = false;

        while (!end) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Round: " + totalRoundsCounter + "\n"
                    + "Make a move.");
            userMove = scan.nextInt();

            int min = 1;
            int max = 3;
            computerMove = (int) Math.floor(Math.random() * (max - min + 1) + min);

            if (userMove == computerMove) {
                System.out.println("Draw!");
            } else {
                if (userMove == 1 && computerMove == 2 || userMove == 2 && computerMove == 3 || userMove == 3 && computerMove == 1) {
                    System.out.println("You lost!");
                    computerScores++;

                } else {
                    if (userMove == 1 && computerMove == 3 || userMove == 2 && computerMove == 1 || userMove == 3 && computerMove == 2) {
                        System.out.println("You won!");
                        userScores++;

                    }
                }

            }

            totalRoundsCounter++;
            System.out.println("Your move: " + userMove + "\n"
                    + "Computer move: " + computerMove + "\n"
                    + "ROUND SUMMARY: "
                    + userName + ": " + userScores + " points, "
                    + "computer: " + computerScores + " points." + "\n"
                    + "GAME SUMMARY: "
                    + "Yours rounds won: " + userScores + ", "
                    + "Computer's rounds won: " + computerScores + "\n");

            if (userNumberOfRounds == userScores || userNumberOfRounds == computerScores ) {
                end = true;

            }
        }
    }

    public void endOfTheGame() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Game over");
        if (userScores > computerScores) {
            System.out.println("Congratulations!!! You won!" + "\n"
                    + "Yours scores: " + userScores + "\n"
                    + "Computer's scores: " + computerScores + "\n"
                    + "If You want to start again choose the 'n'. " + "If You want to end the game choose 'x'");
             } else {
            System.out.println("It's not your day. You lost." + "\n"
                    + "Yours scores: " + userScores + "\n"
                    + "Computer's scores: " + computerScores + "\n"
                    + "If You want to start again choose the 'n'. " + "If You want to end the game choose 'x'");

        }
    }
    public void afterTheEnd() {
            Scan newScan = new Scan();
            userEndMove = newScan.scanValue();
            if ("n".equals(userEndMove)) {
                System.out.println("Are you sure you want to end the actual game? Choose 'a' for YES or 'b' for NO");
                userChoice = newScan.scanValue();
                if ("a".equals(userChoice)) {
                    GameSteps newGame = new GameSteps();
                    newGame.startOfTheGame();
                    newGame.gameRound();
                    newGame.endOfTheGame();
                    newGame.afterTheEnd();
                } else if ( "b".equals(userChoice)) {
                    System.out.println("You stayed in the game.");
                }
            }
            else {
                System.out.println("Are you sure you want to end the game? Choose 'a' for YES or 'b' for NO");
                userChoice2 = newScan.scanValue();
                if ("a".equals(userChoice2)) {
                    System.out.println("We hope you enjoyed the game! Bye!");
                } else {
                    System.out.println("You stayed in the game.");
                }
            }
        }

}
