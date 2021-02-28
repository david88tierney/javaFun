package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int highScore = calculateScore(true, 800, 5,100);
        System.out.println("your final score was " + highScore);
        calculateScore(true, 10000,8,200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was = " + finalScore);
            return finalScore;
        } else{
            return -1;
        }
    }


    public static void displayHighScorePosition(String name, int rank){

    }
}
