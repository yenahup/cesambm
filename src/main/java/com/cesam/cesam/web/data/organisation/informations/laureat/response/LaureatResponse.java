package com.cesam.cesam.web.data.organisation.informations.laureat.response;

import java.sql.Date;

import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;

public class LaureatResponse {

	private Long laureat_id;

    private MemberResponse member;

    private Date dateLaureat;

    private String cycleLaureat;

    private String filliereLaureat;

    private String subjectLaureat;

	public LaureatResponse(Long laureat_id, MemberResponse member, Date dateLaureat, String cycleLaureat,
			String filliereLaureat, String subjectLaureat) {
		super();
		this.laureat_id = laureat_id;
		this.member = member;
		this.dateLaureat = dateLaureat;
		this.cycleLaureat = cycleLaureat;
		this.filliereLaureat = filliereLaureat;
		this.subjectLaureat = subjectLaureat;
	}

	public LaureatResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getLaureat_id() {
		return laureat_id;
	}

	public void setLaureat_id(Long laureat_id) {
		this.laureat_id = laureat_id;
	}

	public MemberResponse getMember() {
		return member;
	}

	public void setMember(MemberResponse member) {
		this.member = member;
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
