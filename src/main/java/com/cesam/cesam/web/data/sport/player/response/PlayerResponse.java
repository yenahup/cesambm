package com.cesam.cesam.web.data.sport.player.response;

import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;
import com.cesam.cesam.web.data.sport.team.response.TeamResponse;

public class PlayerResponse {

    private Long playerId;

    private MemberResponse member;

    private TeamResponse team;

    private String poste;

    private int numero;

    private String pathToProfile;

	public PlayerResponse(Long playerId, MemberResponse member, TeamResponse team, String poste, int numero,
			String pathToProfile) {
		super();
		this.playerId = playerId;
		this.member = member;
		this.team = team;
		this.poste = poste;
		this.numero = numero;
		this.pathToProfile = pathToProfile;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public MemberResponse getMember() {
		return member;
	}

	public void setMember(MemberResponse member) {
		this.member = member;
	}

	public TeamResponse getTeam() {
		return team;
	}

	public void setTeam(TeamResponse team) {
		this.team = team;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPathToProfile() {
		return pathToProfile;
	}

	public void setPathToProfile(String pathToProfile) {
		this.pathToProfile = pathToProfile;
	}
    
    
}
