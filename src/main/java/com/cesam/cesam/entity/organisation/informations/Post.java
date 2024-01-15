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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "posts")
@Data
public class Post {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    @Column(name = "title")
    private String title;

    @Column(name = "date_post")
    private Date datePost;
    
    @ManyToOne
    @JoinColumns({
    	@JoinColumn(name = "bureau_id", referencedColumnName = "bureau_id"),
        @JoinColumn(name = "member_id", referencedColumnName = "member_id"),
        @JoinColumn(name = "responsability_id", referencedColumnName = "responsability_id")
    })
    private Bureau bureau;

    @OneToOne
    @JoinColumn(name = "document_id", referencedColumnName = "document_id")
    private Documents documents;

	public Post(Long postId, String title, Date datePost, Documents documents) {
		super();
		this.postId = postId;
		this.title = title;
		this.datePost = datePost;
		this.documents = documents;
	}

	public Post() {
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

	public Date getDateCreation() {
		return datePost;
	}

	public void setDateCreation(Date dateCreation) {
		this.datePost = dateCreation;
	}

	public Documents getDocuments() {
		return documents;
	}

	public void setDocuments(Documents documents) {
		this.documents = documents;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public Bureau getBureau() {
		return bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}
	
    
}
