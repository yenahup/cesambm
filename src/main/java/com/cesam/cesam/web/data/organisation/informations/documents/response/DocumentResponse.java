package com.cesam.cesam.web.data.organisation.informations.documents.response;

import java.sql.Date;

public class DocumentResponse {

    private Long documentId;

    private String title;

    private String descriptions;

    private Date dateCreation;

    private String pathToDocument;

	public DocumentResponse(Long documentId, String title, String descriptions, Date dateCreation,
			String pathToDocument) {
		super();
		this.documentId = documentId;
		this.title = title;
		this.descriptions = descriptions;
		this.dateCreation = dateCreation;
		this.pathToDocument = pathToDocument;
	}

	public DocumentResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getPathToDocument() {
		return pathToDocument;
	}

	public void setPathToDocument(String pathToDocument) {
		this.pathToDocument = pathToDocument;
	}
    
    
}
