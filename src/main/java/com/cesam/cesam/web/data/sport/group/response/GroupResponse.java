package com.cesam.cesam.web.data.sport.group.response;

import com.cesam.cesam.web.data.sport.team.response.TeamResponse;

public class GroupResponse {

    private Long groupId;

    private String groupName;

    private String difficulty;


    private TeamResponse team1;


    private TeamResponse team2;


    private TeamResponse team3;


    private TeamResponse team4;


    private TeamResponse team5;


	public GroupResponse(Long groupId, String groupName, String difficulty, TeamResponse team1, TeamResponse team2,
			TeamResponse team3, TeamResponse team4, TeamResponse team5) {
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


	public TeamResponse getTeam3() {
		return team3;
	}


	public void setTeam3(TeamResponse team3) {
		this.team3 = team3;
	}


	public TeamResponse getTeam4() {
		return team4;
	}


	public void setTeam4(TeamResponse team4) {
		this.team4 = team4;
	}


	public TeamResponse getTeam5() {
		return team5;
	}


	public void setTeam5(TeamResponse team5) {
		this.team5 = team5;
	}
    
    
}
