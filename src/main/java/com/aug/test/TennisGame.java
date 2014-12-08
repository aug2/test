package com.aug.test;

public class TennisGame {

    String playerA;
    String playerB;

    public TennisGame(String playerA, String playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String getScore() {
       return "Love all";
    }

    public void playerScore(int scoreA, int scoreB) {
    }
}
