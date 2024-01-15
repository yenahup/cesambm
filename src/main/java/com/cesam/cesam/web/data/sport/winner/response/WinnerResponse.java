package com.cesam.cesam.web.data.sport.winner.response;

import com.cesam.cesam.entity.sport.Competition;
import com.cesam.cesam.web.data.sport.merite.response.MeriteResponse;
import com.cesam.cesam.web.data.sport.team.response.TeamResponse;

public class WinnerResponse {

	  
	    private Competition competition;

	
	    private MeriteResponse bestGoalKeeper;

	    private MeriteResponse bestPasser;


	    private MeriteResponse bestScorer;
	    

	    private MeriteResponse bestGammer;

	    private TeamResponse team;

	    private String descriptions;

		public WinnerResponse(Competition competition, MeriteResponse bestGoalKeeper, MeriteResponse bestPasser,
				MeriteResponse bestScorer, MeriteResponse bestGammer, TeamResponse team, String descriptions) {
			super();
			this.competition = competition;
			this.bestGoalKeeper = bestGoalKeeper;
			this.bestPasser = bestPasser;
			this.bestScorer = bestScorer;
			this.bestGammer = bestGammer;
			this.team = team;
			this.descriptions = descriptions;
		}

		public Competition getCompetition() {
			return competition;
		}

		public void setCompetition(Competition competition) {
			this.competition = competition;
		}

		public MeriteResponse getBestGoalKeeper() {
			return bestGoalKeeper;
		}

		public void setBestGoalKeeper(MeriteResponse bestGoalKeeper) {
			this.bestGoalKeeper = bestGoalKeeper;
		}

		public MeriteResponse getBestPasser() {
			return bestPasser;
		}

		public void setBestPasser(MeriteResponse bestPasser) {
			this.bestPasser = bestPasser;
		}

		public MeriteResponse getBestScorer() {
			return bestScorer;
		}

		public void setBestScorer(MeriteResponse bestScorer) {
			this.bestScorer = bestScorer;
		}

		public MeriteResponse getBestGammer() {
			return bestGammer;
		}

		public void setBestGammer(MeriteResponse bestGammer) {
			this.bestGammer = bestGammer;
		}

		public TeamResponse getTeam() {
			return team;
		}

		public void setTeam(TeamResponse team) {
			this.team = team;
		}

		public String getDescriptions() {
			return descriptions;
		}

		public void setDescriptions(String descriptions) {
			this.descriptions = descriptions;
		}
	    
	    

}
