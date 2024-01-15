package com.cesam.cesam.web.data.sport.team.response;

import com.cesam.cesam.web.data.organisation.humain.response.community.CommunityResponse;

public class TeamResponse {

    private Long teamId;
	
    private CommunityResponse community;
    
    private String pathToLogo;
    
    private String descriptions;
    
    private String name;

	public TeamResponse(Long teamId, CommunityResponse community, String pathToLogo, String descriptions, String name) {
		super();
		this.teamId = teamId;
		this.community = community;
		this.pathToLogo = pathToLogo;
		this.descriptions = descriptions;
		this.name = name;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public CommunityResponse getCommunity() {
		return community;
	}

	public void setCommunity(CommunityResponse community) {
		this.community = community;
	}

	public String getPathToLogo() {
		return pathToLogo;
	}

	public void setPathToLogo(String pathToLogo) {
		this.pathToLogo = pathToLogo;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
