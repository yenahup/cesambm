package com.cesam.cesam.entity.sport;


import com.cesam.cesam.entity.organisation.humain.Community;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "team_id")
    private Long teamId;
	
    @ManyToOne
    @JoinColumn(name = "community_id", referencedColumnName = "community_id")
    private Community community;
    
    @Column(name = "path_to_logo")
    private String pathToLogo;
    
    @Column(name = "descriptions")
    private String descriptions;
    
    @Column(name = "name")
    private String name;

	public Team(Long teamId, Community community, String pathToLogo, String descriptions, String name) {
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

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
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
