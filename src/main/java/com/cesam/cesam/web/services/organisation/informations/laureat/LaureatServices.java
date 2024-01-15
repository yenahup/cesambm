package com.cesam.cesam.web.services.organisation.informations.laureat;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesam.cesam.base.image.ImageProcessing;
import com.cesam.cesam.entity.organisation.informations.Documents;
import com.cesam.cesam.entity.organisation.informations.repository.DocumentRepository;
import com.cesam.cesam.web.data.build.BuildDocument;
import com.cesam.cesam.web.data.organisation.informations.documents.request.DocumentRequest;

public class LaureatServices {

	@Autowired 
	DocumentRepository documentRepository;
	private static final String folder = "/src/main/resources/static/Resources/Documents";
	
	public void addDocument(DocumentRequest documentRequest) {
		Documents document = BuildDocument.buildDocument(documentRequest);
		String name = document.getTitle();
		ImageProcessing.saveImage(documentRequest.getFile(),folder , name);
		document.setPathToDocument(folder + name);
		documentRepository.save(document);
	}
	public void updateDocument(DocumentRequest documentRequest, Long documentId) {
		Documents document = BuildDocument.buildDocument(documentRequest);
		String name = documentRequest.getTitle();
		ImageProcessing.saveImage(documentRequest.getFile(),folder , name);
		document.setPathToDocument(folder + name);
		document.setDocumentId(documentId);
        documentRepository.save(document);
	}
}
