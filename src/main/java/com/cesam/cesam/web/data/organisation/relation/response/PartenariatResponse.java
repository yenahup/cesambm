package com.cesam.cesam.web.data.organisation.relation.response;

import java.sql.Date;


public class PartenariatResponse {

    private Long partenariatId;

    private String partenariatName;

    private Date partenariatDate;

    private String pathToLogo;

	public PartenariatResponse(Long partenariatId, String partenariatName, Date partenariatDate, String pathToLogo) {
		super();
		this.partenariatId = partenariatId;
		this.partenariatName = partenariatName;
		this.partenariatDate = partenariatDate;
		this.pathToLogo = pathToLogo;
	}

	public PartenariatResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getPartenariatId() {
		return partenariatId;
	}

	public void setPartenariatId(Long partenariatId) {
		this.partenariatId = partenariatId;
	}

	public String getPartenariatName() {
		return partenariatName;
	}

	public void setPartenariatName(String partenariatName) {
		this.partenariatName = partenariatName;
	}

	public Date getPartenariatDate() {
		return partenariatDate;
	}

	public void setPartenariatDate(Date partenariatDate) {
		this.partenariatDate = partenariatDate;
	}

	public String getPathToLogo() {
		return pathToLogo;
	}

	public void setPathToLogo(String pathToLogo) {
		this.pathToLogo = pathToLogo;
	}
}
