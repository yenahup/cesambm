package com.cesam.cesam.entity.sport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "game_result")
public class GameResult {
	

	    @Id
	    @Column(name = "game_result_id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long gameResultId;

	    @Column(name = "score_team_1")
	    private int scoreTeam1;
	    
	    @Column(name = "score_team_2")
	    private int scoreTeam2;

	    @ManyToOne
	    @JoinColumn(name = "team_id")
	    private Winner winner;

	    @OneToOne
	    @JoinColumn(name = "game_winner_id")
	    private GameWinner gameWinner;
	    
	    @OneToOne
	    @JoinColumn(name = "game__id")
	    private Game game;

		public GameResult(Long gameResultId, int scoreTeam1, int scoreTeam2, Winner winner, GameWinner gameWinner,
				Game game) {
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

		public Winner getWinner() {
			return winner;
		}

		public void setWinner(Winner winner) {
			this.winner = winner;
		}

		public GameWinner getGameWinner() {
			return gameWinner;
		}

		public void setGameWinner(GameWinner gameWinner) {
			this.gameWinner = gameWinner;
		}

		public Game getGame() {
			return game;
		}

		public void setGame(Game game) {
			this.game = game;
		}
	    
	    
}
