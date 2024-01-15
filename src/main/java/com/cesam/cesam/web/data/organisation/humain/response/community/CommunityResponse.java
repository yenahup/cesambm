package com.cesam.cesam.web.data.organisation.humain.response.community;

import java.sql.Date;


public class CommunityResponse {

    private Long communityId;

    private String country;

    private Date belongDate;

    private String descriptions;

    private String communityName;

    private String pathToLogo;

	public CommunityResponse(Long communityId, String country, Date belongDate, String descriptions,
			String communityName, String pathToLogo) {
		super();
		this.communityId = communityId;
		this.country = country;
		this.belongDate = belongDate;
		this.descriptions = descriptions;
		this.communityName = communityName;
		this.pathToLogo = pathToLogo;
	}

	public CommunityResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Long communityId) {
		this.communityId = communityId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getBelongDate() {
		return belongDate;
	}

	public void setBelongDate(Date belongDate) {
		this.belongDate = belongDate;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getPathToLogo() {
		return pathToLogo;
	}

	public void setPathToLogo(String pathToLogo) {
		this.pathToLogo = pathToLogo;
	}

    
}
