package com.cesam.cesam.web.data.sport.gameresult.response;

import com.cesam.cesam.web.data.sport.game.response.GameResponse;
import com.cesam.cesam.web.data.sport.gamewinner.response.GameWinnerResponse;
import com.cesam.cesam.web.data.sport.winner.response.WinnerResponse;

public class GameResultResponse {

    private Long gameResultId;

    private int scoreTeam1;
    
    private int scoreTeam2;
    
    private WinnerResponse winner;

  
    private GameWinnerResponse gameWinner;

    private GameResponse game;

	public GameResultResponse(Long gameResultId, int scoreTeam1, int scoreTeam2, WinnerResponse winner,
			GameWinnerResponse gameWinner, GameResponse game) {
		super();
		this.gameResultId = gameResultId;
		this.scoreTeam1 = scoreTeam1;
		this.scoreTeam2 = scoreTeam2;
		this.winner = winner;
		this.gameWinner = gameWinner;
		this.game = game;
	}

	public Long getGameResultId() {
		return gameResultId;
	}

	public void setGameResultId(Long gameResultId) {
		this.gameResultId = gameResultId;
	}

	public int getScoreTeam1() {
		return scoreTeam1;
	}

	public void setScoreTeam1(int scoreTeam1) {
		this.scoreTeam1 = scoreTeam1;
	}

	public int getScoreTeam2() {
		return scoreTeam2;
	}

	public void setScoreTeam2(int scoreTeam2) {
		this.scoreTeam2 = scoreTeam2;
	}

	public WinnerResponse getWinner() {
		return winner;
	}

	public void setWinner(WinnerResponse winner) {
		this.winner = winner;
	}

	public GameWinnerResponse getGameWinner() {
		return gameWinner;
	}

	public void setGameWinner(GameWinnerResponse gameWinner) {
		this.gameWinner = gameWinner;
	}

	public GameResponse getGame() {
		return game;
	}

	public void setGame(GameResponse game) {
		this.game = game;
	}
    
    
}
