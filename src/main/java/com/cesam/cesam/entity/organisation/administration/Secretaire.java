package com.cesam.cesam.entity.organisation.administration;

import java.sql.Date;

import com.cesam.cesam.entity.organisation.humain.Community;
import com.cesam.cesam.entity.organisation.humain.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "secretaire")
@Data
public class Secretaire {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "secretaire_id")
    private Long secretaireId;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "community_id", referencedColumnName = "community_id")
    private Community community;

    @Column(name = "mandat_end")
    private Date mandatEnd;
    
    @Column(name = "mandat_start")
    private Date mandatStart;

	public Secretaire(Long secretaireId, Member member, Community community, Date mandatEnd, Date mandatStart) {
		super();
		this.secretaireId = secretaireId;
		this.member = member;
		this.community = community;
		this.mandatEnd = mandatEnd;
		this.mandatStart = mandatStart;
	}

	
	public Date getMandatEnd() {
		return mandatEnd;
	}


	public void setMandatEnd(Date mandatEnd) {
		this.mandatEnd = mandatEnd;
	}


	public Date getMandatStart() {
		return mandatStart;
	}


	public void setMandatStart(Date mandatStart) {
		this.mandatStart = mandatStart;
	}


	public Long getSecretaireId() {
		return secretaireId;
	}

	public void setSecretaireId(Long secretaireId) {
		this.secretaireId = secretaireId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}
    
    
}
