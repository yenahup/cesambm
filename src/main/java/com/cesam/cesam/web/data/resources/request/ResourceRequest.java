package com.cesam.cesam.web.data.resources.request;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class ResourceRequest {

    private Long ressourcesId;

    private String titleRessource;

    private String typeRessource;

    private MultipartFile file ;

    private Date dateRessource;

    private Long bureauId;

	public ResourceRequest(Long ressourcesId, String titleRessource, String typeRessource, MultipartFile file,
			Date dateRessource, Long bureauId) {
		super();
		this.ressourcesId = ressourcesId;
		this.titleRessource = titleRessource;
		this.typeRessource = typeRessource;
		this.file = file;
		this.dateRessource = dateRessource;
		this.bureauId = bureauId;
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

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Date getDateRessource() {
		return dateRessource;
	}

	public void setDateRessource(Date dateRessource) {
		this.dateRessource = dateRessource;
	}

	public Long getBureauId() {
		return bureauId;
	}

	public void setBureauId(Long bureauId) {
		this.bureauId = bureauId;
	}
    
    
    
}
