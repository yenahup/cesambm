package com.cesam.cesam.web.data.resources.response;

import java.sql.Date;

import com.cesam.cesam.web.data.organisation.bureau.response.BureauResponse;

public class ResourceResponse {

    private Long ressourcesId;

    private String titleRessource;

    private String typeRessource;

    private String pathToRessource;

    private Date dateRessource;

    private BureauResponse bureau;

	public ResourceResponse(Long ressourcesId, String titleRessource, String typeRessource, String pathToRessource,
			Date dateRessource, BureauResponse bureau) {
		super();
		this.ressourcesId = ressourcesId;
		this.titleRessource = titleRessource;
		this.typeRessource = typeRessource;
		this.pathToRessource = pathToRessource;
		this.dateRessource = dateRessource;
		this.bureau = bureau;
	}

	public ResourceResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getRessourcesId() {
		return ressourcesId;
	}

	public void setRessourcesId(Long ressourcesId) {
		this.ressourcesId = ressourcesId;
	}

	public String getTitleRessource() {
		return titleRessource;
	}

	public void setTitleRessource(String titleRessource) {
		this.titleRessource = titleRessource;
	}

	public String getTypeRessource() {
		return typeRessource;
	}

	public void setTypeRessource(String typeRessource) {
		this.typeRessource = typeRessource;
	}

	public String getPathToRessource() {
		return pathToRessource;
	}

	public void setPathToRessource(String pathToRessource) {
		this.pathToRessource = pathToRessource;
	}

	public Date getDateRessource() {
		return dateRessource;
	}

	public void setDateRessource(Date dateRessource) {
		this.dateRessource = dateRessource;
	}

	public BureauResponse getBureau() {
		return bureau;
	}

	public void setBureau(BureauResponse bureau) {
		this.bureau = bureau;
	}
    
    
}
