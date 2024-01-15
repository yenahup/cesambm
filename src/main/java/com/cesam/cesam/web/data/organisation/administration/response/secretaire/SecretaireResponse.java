package com.cesam.cesam.web.data.organisation.administration.response.secretaire;

import java.sql.Date;

import com.cesam.cesam.web.data.organisation.humain.response.community.CommunityResponse;
import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;

public class SecretaireResponse {

    private Long secretaireId;

    private MemberResponse member;

    private CommunityResponse community;

    private Date mandatEnd;
    
    private Date mandatStart;

	public SecretaireResponse(Long secretaireId, MemberResponse member, CommunityResponse community, Date mandatEnd,
			Date mandatStart) {
		super();
		this.secretaireId = secretaireId;
		this.member = member;
		this.community = community;
		this.mandatEnd = mandatEnd;
		this.mandatStart = mandatStart;
	}

	public SecretaireResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getSecretaireId() {
		return secretaireId;
	}

	public void setSecretaireId(Long secretaireId) {
		this.secretaireId = secretaireId;
	}

	public MemberResponse getMember() {
		return member;
	}

	public void setMember(MemberResponse member) {
		this.member = member;
	}

	public CommunityResponse getCommunity() {
		return community;
	}

	public void setCommunity(CommunityResponse community) {
		this.community = community;
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
    
    
    
    
}
