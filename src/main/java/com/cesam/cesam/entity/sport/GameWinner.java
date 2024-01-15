package com.cesam.cesam.entity.sport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "game_winner")
public class GameWinner {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "game_winner_id")
    private Long gameWinnerId;

    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "team_id")
    private Team teamWinner;

    @ManyToOne
    @JoinColumn(name = "best_player", referencedColumnName = "merite_id")
    private Merite bestPlayer;

    @ManyToOne
    @JoinColumn(name = "best_scorer", referencedColumnName = "merite_id")
    private Merite bestScorer;

    @ManyToOne
    @JoinColumn(name = "best_passer", referencedColumnName = "merite_id")
    private Merite bestPasser;
    
    @Column(name = "descriptions")
    private String descriptions;
    
	
	
	public GameWinner(Long gameWinnerId, Team teamWinner, Merite bestPlayer, Merite bestScorer, Merite bestPasser,
			String descriptions) {
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
	public Team getTeamWinner() {
		return teamWinner;
	}
	public void setTeamWinner(Team teamWinner) {
		this.teamWinner = teamWinner;
	}
	
	public Merite getBestPlayer() {
		return bestPlayer;
	}
	public void setBestPlayer(Merite bestPlayer) {
		this.bestPlayer = bestPlayer;
	}
	public Merite getBestScorer() {
		return bestScorer;
	}
	public void setBestScorer(Merite bestScorer) {
		this.bestScorer = bestScorer;
	}
	public Merite getBestPasser() {
		return bestPasser;
	}
	public void setBestPasser(Merite bestPasser) {
		this.bestPasser = bestPasser;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
    
    

}
