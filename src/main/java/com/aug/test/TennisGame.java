package com.aug.test;

public class TennisGame {

    String playerA;
    String playerB;
    int scoreA;
    int scoreB;
    
    public TennisGame(String playerA, String playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String getScore() {
    	if(scoreA==15){
    		return "Fifteen Love";
    	}
    	else {
    		return "Love all";
		}	
    }

    public void playerScore(int scoreA, int scoreB) {
    	this.scoreA = scoreA;
    	this.scoreB = scoreB;
    }
}
