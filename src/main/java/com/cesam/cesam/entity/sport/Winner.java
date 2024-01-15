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
@Table(name = "winner")
public class Winner {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "winner_id")
	    private Long winnerId;

	    @OneToOne
	    @JoinColumn(name = "competition_id")
	    private Competition competition;

	    @ManyToOne
	    @JoinColumn(name = "best_goal_keeper", referencedColumnName = "merite_id")
	    private Merite bestGoalKeeper;

	    @ManyToOne
	    @JoinColumn(name = "best_passer",referencedColumnName = "merite_id")
	    private Merite bestPasser;

	    @ManyToOne
	    @JoinColumn(name = "best_scorer", referencedColumnName = "merite_id")
	    private Merite bestScorer;
	    
	    @ManyToOne
	    @JoinColumn(name = "best_gammer", referencedColumnName = "merite_id")
	    private Merite bestGammer;
	    
	    @ManyToOne
	    @JoinColumn(name = "team", referencedColumnName = "team_id")
	    private Team team;
	    
	    @Column(name = "descriptions")
	    private String descriptions;

		

		public Winner(Long winnerId, Competition competition, Merite bestGoalKeeper, Merite bestPasser,
				Merite bestScorer, Merite bestGammer, Team team, String descriptions) {
			super();
			this.winnerId = winnerId;
			this.competition = competition;
			this.bestGoalKeeper = bestGoalKeeper;
			this.bestPasser = bestPasser;
			this.bestScorer = bestScorer;
			this.bestGammer = bestGammer;
			this.team = team;
			this.descriptions = descriptions;
		}

		public Long getWinnerId() {
			return winnerId;
		}

		public void setWinnerId(Long winnerId) {
			this.winnerId = winnerId;
		}

		public Competition getCompetition() {
			return competition;
		}

		public void setCompetition(Competition competition) {
			this.competition = competition;
		}

	
		public String getDescriptions() {
			return descriptions;
		}

		public void setDescriptions(String descriptions) {
			this.descriptions = descriptions;
		}

		public Team getTeam() {
			return team;
		}

		public void setTeam(Team team) {
			this.team = team;
		}

		public Merite getBestGoalKeeper() {
			return bestGoalKeeper;
		}

		public void setBestGoalKeeper(Merite bestGoalKeeper) {
			this.bestGoalKeeper = bestGoalKeeper;
		}

		public Merite getBestPasser() {
			return bestPasser;
		}

		public void setBestPasser(Merite bestPasser) {
			this.bestPasser = bestPasser;
		}

		public Merite getBestScorer() {
			return bestScorer;
		}

		public void setBestScorer(Merite bestScorer) {
			this.bestScorer = bestScorer;
		}

		public Merite getBestGammer() {
			return bestGammer;
		}

		public void setBestGammer(Merite bestGammer) {
			this.bestGammer = bestGammer;
		}
	    
	    
}
