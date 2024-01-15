package com.cesam.cesam.web.data.sport.game.response;

import java.sql.Date;

import com.cesam.cesam.web.data.sport.arbitre.response.ArbitreResponse;
import com.cesam.cesam.web.data.sport.competition.response.CompetitionResponse;
import com.cesam.cesam.web.data.sport.group.response.GroupResponse;
import com.cesam.cesam.web.data.sport.lieu.response.LieuResponse;
import com.cesam.cesam.web.data.sport.team.response.TeamResponse;

public class GameResponse {



    private Long gameId;


    private GroupResponse group;

    private TeamResponse team1;


    private TeamResponse team2;


    private ArbitreResponse arbitre;


    private CompetitionResponse competition;

    private LieuResponse lieux;

    private String descriptions;

    private int spectatorsNumbers;

    private String typeGame;

    private Date dateGame;

	public GameResponse(Long gameId, GroupResponse group, TeamResponse team1, TeamResponse team2,
			ArbitreResponse arbitre, CompetitionResponse competition, LieuResponse lieux, String descriptions,
			int spectatorsNumbers, String typeGame, Date dateGame) {
		super();
		this.gameId = gameId;
		this.group = group;
		this.team1 = team1;
		this.team2 = team2;
		this.arbitre = arbitre;
		this.competition = competition;
		this.lieux = lieux;
		this.descriptions = descriptions;
		this.spectatorsNumbers = spectatorsNumbers;
		this.typeGame = typeGame;
		this.dateGame = dateGame;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public GroupResponse getGroup() {
		return group;
	}

	public void setGroup(GroupResponse group) {
		this.group = group;
	}

	public TeamResponse getTeam1() {
		return team1;
	}

	public void setTeam1(TeamResponse team1) {
		this.team1 = team1;
	}

	public TeamResponse getTeam2() {
		return team2;
	}

	public void setTeam2(TeamResponse team2) {
		this.team2 = team2;
	}

	public ArbitreResponse getArbitre() {
		return arbitre;
	}

	public void setArbitre(ArbitreResponse arbitre) {
		this.arbitre = arbitre;
	}

	public CompetitionResponse getCompetition() {
		return competition;
	}

	public void setCompetition(CompetitionResponse competition) {
		this.competition = competition;
	}

	public LieuResponse getLieux() {
		return lieux;
	}

	public void setLieux(LieuResponse lieux) {
		this.lieux = lieux;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public int getSpectatorsNumbers() {
		return spectatorsNumbers;
	}

	public void setSpectatorsNumbers(int spectatorsNumbers) {
		this.spectatorsNumbers = spectatorsNumbers;
	}

	public String getTypeGame() {
		return typeGame;
	}

	public void setTypeGame(String typeGame) {
		this.typeGame = typeGame;
	}

	public Date getDateGame() {
		return dateGame;
	}

	public void setDateGame(Date dateGame) {
		this.dateGame = dateGame;
	}
    
    
    
    
}
