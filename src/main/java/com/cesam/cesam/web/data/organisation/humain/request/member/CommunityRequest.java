package com.cesam.cesam.web.data.organisation.humain.request.member;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class CommunityRequest {

    private Long communityId;

    private String country;

    private Date belongDate;

    private String descriptions;

    private String communityName;
    
    private MultipartFile file;

	public CommunityRequest(Long communityId, String country, Date belongDate, String descriptions,
			String communityName, MultipartFile file) {
		super();
		this.communityId = communityId;
		this.country = country;
		this.belongDate = belongDate;
		this.descriptions = descriptions;
		this.communityName = communityName;
		this.file = file;
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

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
    
    
}
