package com.cesam.cesam.web.data.organisation.bureau.response;

import java.sql.Date;

import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;


public class BureauResponse {


    private Long bureauId;
	
	private Long memberId;

	private Long responsabilityId;

    private MemberResponse member;


    private String mots; 
    
    private Date mandatStart; 
    
    private Date mandatEnd;
    
    private boolean isCurrent;

	public BureauResponse(Long bureauId, Long memberId, Long responsabilityId, MemberResponse member,
			 String mots, Date mandatStart, Date mandatEnd, boolean isCurrent) {
		super();
		this.bureauId = bureauId;
		this.memberId = memberId;
		this.responsabilityId = responsabilityId;
		this.member = member;
		this.mots = mots;
		this.mandatStart = mandatStart;
		this.mandatEnd = mandatEnd;
		this.isCurrent = isCurrent;
	}

	public BureauResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getBureauId() {
		return bureauId;
	}

	public void setBureauId(Long bureauId) {
		this.bureauId = bureauId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getResponsabilityId() {
		return responsabilityId;
	}

	public void setResponsabilityId(Long responsabilityId) {
		this.responsabilityId = responsabilityId;
	}

	public MemberResponse getMember() {
		return member;
	}

	public void setMember(MemberResponse member) {
		this.member = member;
	}

	
	public String getMots() {
		return mots;
	}

	public void setMots(String mots) {
		this.mots = mots;
	}

	public Date getMandatStart() {
		return mandatStart;
	}

	public void setMandatStart(Date mandatStart) {
		this.mandatStart = mandatStart;
	}

	public Date getMandatEnd() {
		return mandatEnd;
	}

	public void setMandatEnd(Date mandatEnd) {
		this.mandatEnd = mandatEnd;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}
    
    
    
}
