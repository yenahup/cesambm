package com.cesam.cesam.web.data.sport.arbitre.response;

import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;

public class ArbitreResponse {

    private Long arbitreId;

    private MemberResponse member;
    
    private String descriptions;

	public ArbitreResponse(Long arbitreId, MemberResponse member, String descriptions) {
		super();
		this.arbitreId = arbitreId;
		this.member = member;
		this.descriptions = descriptions;
	}

	public ArbitreResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getArbitreId() {
		return arbitreId;
	}

	public void setArbitreId(Long arbitreId) {
		this.arbitreId = arbitreId;
	}

	public MemberResponse getMember() {
		return member;
	}

	public void setMember(MemberResponse member) {
		this.member = member;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
    
    
    
}
