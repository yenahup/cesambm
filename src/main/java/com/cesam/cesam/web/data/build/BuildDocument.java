package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.informations.Documents;
import com.cesam.cesam.web.data.organisation.informations.documents.request.DocumentRequest;
import com.cesam.cesam.web.data.organisation.informations.documents.response.DocumentResponse;

public class BuildDocument {

	public static DocumentResponse buildDocument(Documents document) {
		DocumentResponse documentResponse = new DocumentResponse();
		documentResponse.setDateCreation(document.getDateCreation());
		documentResponse.setDocumentId(document.getDocumentId());
		documentResponse.setPathToDocument(document.getPathToDocument());
		documentResponse.setTitle(document.getTitle());
		documentResponse.setDescriptions(document.getDescriptions());
		return documentResponse;
	}
	
	public static List<DocumentResponse> buildDocument(List<Documents> documents) {
		ArrayList<DocumentResponse> documentsResponses = new ArrayList<DocumentResponse>();
		for (Documents document : documents) {
			documentsResponses.add(buildDocument(document));
		}
		return documentsResponses;
	}
	
	public static Documents buildDocument(DocumentRequest documentRequest){
		Documents document = new Documents();
		document.setDateCreation(documentRequest.getDateCreation());
		document.setDescriptions(documentRequest.getDescriptions());
		document.setTitle(documentRequest.getTitle());
		return document;
	}
}
