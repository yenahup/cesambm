package com.cesam.cesam.web.data.organisation.informations.posts.response;

import java.sql.Date;

import com.cesam.cesam.web.data.organisation.bureau.response.BureauResponse;
import com.cesam.cesam.web.data.organisation.informations.documents.response.DocumentResponse;

public class PostResponse {

    private Long postId;

    private String title;

    private Date datePost;

    private BureauResponse bureau;

    private DocumentResponse documents;

	public PostResponse(Long postId, String title, Date datePost, BureauResponse bureau, DocumentResponse documents) {
		super();
		this.postId = postId;
		this.title = title;
		this.datePost = datePost;
		this.bureau = bureau;
		this.documents = documents;
	}

	public PostResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public BureauResponse getBureau() {
		return bureau;
	}

	public void setBureau(BureauResponse bureau) {
		this.bureau = bureau;
	}

	public DocumentResponse getDocuments() {
		return documents;
	}

	public void setDocuments(DocumentResponse documents) {
		this.documents = documents;
	}
    
    
}
