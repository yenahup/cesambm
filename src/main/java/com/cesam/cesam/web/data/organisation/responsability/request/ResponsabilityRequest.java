package com.cesam.cesam.web.data.organisation.responsability.request;

import java.sql.Date;

public class ResponsabilityRequest {

    private Long responsabilityId;

    private String title;

    private Date dateCreation;

    private String descriptions;

	public ResponsabilityRequest(Long responsabilityId, String title, Date dateCreation, String descriptions) {
		super();
		this.responsabilityId = responsabilityId;
		this.title = title;
		this.dateCreation = dateCreation;
		this.descriptions = descriptions;
	}

	public Long getResponsabilityId() {
		return responsabilityId;
	}

	public void setResponsabilityId(Long responsabilityId) {
		this.responsabilityId = responsabilityId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
    
        

}
