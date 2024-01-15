package com.cesam.cesam.web.data.organisation.informations.documents.request;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class DocumentRequest {


	    private String title;

	    private String descriptions;

	    private Date dateCreation;

	    private MultipartFile file;

		public DocumentRequest(String title, String descriptions, Date dateCreation, MultipartFile file) {
			super();
			this.title = title;
			this.descriptions = descriptions;
			this.dateCreation = dateCreation;
			this.file = file;
		}

		public DocumentRequest() {
			
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

		public MultipartFile getFile() {
			return file;
		}

		public void setFile(MultipartFile file) {
			this.file = file;
		}

		
	    
	    
}
