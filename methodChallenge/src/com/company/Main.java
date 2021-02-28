package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        int position;

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("David", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gigi", highScorePosition);


    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get in position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000){
            return 1;
        } else if ( score > 500 && score < 1000){
            return 2;
        } else if ( score > 100 && score < 500) {
            return 3;
        } else  {
            return 4;
        }
    }
}
