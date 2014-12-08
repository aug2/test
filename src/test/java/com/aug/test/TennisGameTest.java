package com.aug.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameTest {

	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		TennisGame tennisGame = new TennisGame("Player A", "Player B");
		String score = tennisGame.getScore();
		assertEquals("Love all", score);
	}

    @Test
    public void playerAWinFirstBallShouldReturnFifteenLove() throws Exception {
        TennisGame tennisGame = new TennisGame("Player A", "Player B");
        tennisGame.playerScore(15, 0);
        String score = tennisGame.getScore();
        assertEquals("Fifteen Love", score);
    }
}
