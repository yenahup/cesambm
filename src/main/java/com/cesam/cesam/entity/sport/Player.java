package com.cesam.cesam.entity.sport;

import com.cesam.cesam.entity.organisation.humain.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "player_id")
    private Long playerId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    @Column(name = "poste")
    private String poste;
    @Column(name = "numero")
    private int numero;
    @Column(name = "path_to_profile")
    private String pathToProfile;
    
    public Player() {
    	
    }
	public Player(Long playerId, Member member, Team team, String poste, int numero, String pathToProfile) {
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
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
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
 