package com.cesam.cesam.entity.sport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "groupe")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "group_name")
    private String groupName;
    @Column(name = "difficulty")
    private String difficulty;

    @OneToOne
    @JoinColumn(name = "team_1")
    private Team team1;

    @OneToOne
    @JoinColumn(name = "team_2")
    private Team team2;

    @OneToOne
    @JoinColumn(name = "team_3")
    private Team team3;

    @OneToOne
    @JoinColumn(name = "team_4")
    private Team team4;

    @OneToOne
    @JoinColumn(name = "team_5")
    private Team team5;

	public Group(Long groupId, String groupName, String difficulty, Team team1, Team team2, Team team3, Team team4,
			Team team5) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.difficulty = difficulty;
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		this.team4 = team4;
		this.team5 = team5;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
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

	public Team getTeam3() {
		return team3;
	}

	public void setTeam3(Team team3) {
		this.team3 = team3;
	}

	public Team getTeam4() {
		return team4;
	}

	public void setTeam4(Team team4) {
		this.team4 = team4;
	}

	public Team getTeam5() {
		return team5;
	}

	public void setTeam5(Team team5) {
		this.team5 = team5;
	}
    
    

}
