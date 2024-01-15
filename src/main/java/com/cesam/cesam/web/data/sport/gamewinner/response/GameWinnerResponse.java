package com.cesam.cesam.web.data.sport.gamewinner.response;

import com.cesam.cesam.web.data.sport.merite.response.MeriteResponse;
import com.cesam.cesam.web.data.sport.team.response.TeamResponse;

public class GameWinnerResponse {

    private Long gameWinnerId;

  
    private TeamResponse teamWinner;

    private MeriteResponse bestPlayer;

    private MeriteResponse bestScorer;

    private MeriteResponse bestPasser;

    private String descriptions;

	public GameWinnerResponse(Long gameWinnerId, TeamResponse teamWinner, MeriteResponse bestPlayer,
			MeriteResponse bestScorer, MeriteResponse bestPasser, String descriptions) {
		super();
		this.gameWinnerId = gameWinnerId;
		this.teamWinner = teamWinner;
		this.bestPlayer = bestPlayer;
		this.bestScorer = bestScorer;
		this.bestPasser = bestPasser;
		this.descriptions = descriptions;
	}

	public Long getGameWinnerId() {
		return gameWinnerId;
	}

	public void setGameWinnerId(Long gameWinnerId) {
		this.gameWinnerId = gameWinnerId;
	}

	public TeamResponse getTeamWinner() {
		return teamWinner;
	}

	public void setTeamWinner(TeamResponse teamWinner) {
		this.teamWinner = teamWinner;
	}

	public MeriteResponse getBestPlayer() {
		return bestPlayer;
	}

	public void setBestPlayer(MeriteResponse bestPlayer) {
		this.bestPlayer = bestPlayer;
	}

	public MeriteResponse getBestScorer() {
		return bestScorer;
	}

	public void setBestScorer(MeriteResponse bestScorer) {
		this.bestScorer = bestScorer;
	}

	public MeriteResponse getBestPasser() {
		return bestPasser;
	}

	public void setBestPasser(MeriteResponse bestPasser) {
		this.bestPasser = bestPasser;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
    
}
