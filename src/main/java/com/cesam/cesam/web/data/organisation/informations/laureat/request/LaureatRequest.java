package com.cesam.cesam.web.data.organisation.informations.laureat.request;

import java.sql.Date;

public class LaureatRequest {

	private Long laureatId;

    private Long memberId;

    private Date dateLaureat;

    private String cycleLaureat;

    private String filliereLaureat;

    private String subjectLaureat;

	public LaureatRequest(Long laureatId, Long member, Date dateLaureat, String cycleLaureat, String filliereLaureat,
			String subjectLaureat) {
		super();
		this.laureatId = laureatId;
		this.memberId = member;
		this.dateLaureat = dateLaureat;
		this.cycleLaureat = cycleLaureat;
		this.filliereLaureat = filliereLaureat;
		this.subjectLaureat = subjectLaureat;
	}

	public Long getLaureatId() {
		return laureatId;
	}

	public void setLaureatId(Long laureatId) {
		this.laureatId = laureatId;
	}

	
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Date getDateLaureat() {
		return dateLaureat;
	}

	public void setDateLaureat(Date dateLaureat) {
		this.dateLaureat = dateLaureat;
	}

	public String getCycleLaureat() {
		return cycleLaureat;
	}

	public void setCycleLaureat(String cycleLaureat) {
		this.cycleLaureat = cycleLaureat;
	}

	public String getFilliereLaureat() {
		return filliereLaureat;
	}

	public void setFilliereLaureat(String filliereLaureat) {
		this.filliereLaureat = filliereLaureat;
	}

	public String getSubjectLaureat() {
		return subjectLaureat;
	}

	public void setSubjectLaureat(String subjectLaureat) {
		this.subjectLaureat = subjectLaureat;
	}
    
    
}
