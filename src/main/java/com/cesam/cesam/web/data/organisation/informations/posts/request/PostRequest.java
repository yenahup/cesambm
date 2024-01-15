package com.cesam.cesam.web.data.organisation.informations.posts.request;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class PostRequest {


    private Long postId;

    private String title;

    private Date datePost;
    

    private Long bureauId;

    private MultipartFile file;

	public PostRequest(Long postId, String title, Date datePost, Long bureauId, MultipartFile file) {
		super();
		this.postId = postId;
		this.title = title;
		this.datePost = datePost;
		this.bureauId = bureauId;
		this.file = file;
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

	public Long getBureauId() {
		return bureauId;
	}

	public void setBureauId(Long bureauId) {
		this.bureauId = bureauId;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
    
    

}
