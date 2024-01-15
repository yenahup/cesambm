package com.cesam.cesam.entity.organisation.informations;

import java.sql.Date;

import com.cesam.cesam.entity.organisation.administration.Bureau;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "documents")
@Data
public class Documents {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long documentId;

    @Column(name = "title")
    private String title;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "path_to_document")
    private String pathToDocument;

    @ManyToOne
    @JoinColumns({
    	@JoinColumn(name = "bureau_id", referencedColumnName = "bureau_id"),
        @JoinColumn(name = "member_id", referencedColumnName = "member_id"),
        @JoinColumn(name = "responsability_id", referencedColumnName = "responsability_id")
    })
    private Bureau bureau;
    
  
    
   
	
	public Documents(Long documentId, String title, String descriptions, Date dateCreation, String pathToDocument,
			Bureau bureau) {
		super();
		this.documentId = documentId;
		this.title = title;
		this.descriptions = descriptions;
		this.dateCreation = dateCreation;
		this.pathToDocument = pathToDocument;
		this.bureau = bureau;
	}

	public Documents() {
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

	public Bureau getBureau() {
		return bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}
   
	
    
    
}
