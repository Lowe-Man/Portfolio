package com.company;

public class Main {

  public static void main(String[] args) {
    int highScore = calculateScore(true, 5000, 5, 100);
    System.out.println("Your final score was " + highScore);

    highScore = calculateScore(true, 10000, 8, 200);
    System.out.println("Your final score was " + highScore);

    // Create a method called displayHighScorePosition
    // it should return a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and teh position they got and a further message " on the high score table "
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent on argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and <1000
    // 3 if the score is >=100 and <500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Alex", highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Bob", highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Kim", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Jim", highScorePosition);

    highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("Brian", highScorePosition);

    highScorePosition = calculateHighScorePosition(500);
    displayHighScorePosition("Mark", highScorePosition);

    highScorePosition = calculateHighScorePosition(100);
    displayHighScorePosition("Sam", highScorePosition);
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      return finalScore;
    } else {
      return -1;
    }
  }

  public static void displayHighScorePosition(String playerName, int position) {
    System.out.println(playerName + " managed to get into position " + position + " on the high score table");
  }

  public static int calculateHighScorePosition(int playerScore) {
    if (playerScore >= 1000) {
      return 1;
    } else if (playerScore >= 500 && playerScore < 1000) {
      return 2;
    } else if (playerScore >= 100 && playerScore < 500) {
      return 3;
    } else {
      return 4;
    }
  }
}
