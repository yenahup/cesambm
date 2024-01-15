package com.cesam.cesam.entity.sport;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "game_id")
    private Long gameId;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "team_1")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team_2")
    private Team team2;

    @ManyToOne
    @JoinColumn(name = "arbitre_id")
    private Arbitre arbitre;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;

    @ManyToOne
    @JoinColumn(name = "lieux_id")
    private Lieux lieux;

    @Column(name = "descriptions")
    private String descriptions;
    @Column(name = "spectators_number")
    private int spectatorsNumbers;
    @Column(name = "type_game")
    private String typeGame;
    @Column(name = "date_game")
    private Date dateGame;
    
    
	public Game(Long gameId, Group group, Team team1, Team team2, Arbitre arbitre,
			Competition competition, Lieux lieux, String descriptions, int spectatorsNumbers, String typeGame,
			Date dateGame) {
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


	public Group getGroup() {
		return group;
	}


	public void setGroup(Group group) {
		this.group = group;
	}


	public Team getTeam1() {
		return team1;
	}


	public void setTeam1(Team team1) {
		this.team1 = team1;
	}


	public Team getTeam2() {
		return team2;
	}


	public void setTeam2(Team team2) {
		this.team2 = team2;
	}


	

	public Arbitre getArbitre() {
		return arbitre;
	}


	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}


	public Competition getCompetition() {
		return competition;
	}


	public void setCompetition(Competition competition) {
		this.competition = competition;
	}


	public Lieux getLieux() {
		return lieux;
	}


	public void setLieux(Lieux lieux) {
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
