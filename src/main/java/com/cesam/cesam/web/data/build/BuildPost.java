package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.informations.Post;
import com.cesam.cesam.web.data.organisation.informations.posts.request.PostRequest;
import com.cesam.cesam.web.data.organisation.informations.posts.response.PostResponse;

public class BuildPost {

	public static PostResponse buildPost(Post post) {
		PostResponse postResponse = new PostResponse();
		postResponse.setBureau(BuildBureau.buildBureau(post.getBureau()));
		postResponse.setDatePost(post.getDatePost());
		postResponse.setDocuments(BuildDocument.buildDocument(post.getDocuments()));
		postResponse.setPostId(post.getPostId());
		postResponse.setTitle(post.getTitle());
		return postResponse;
	}
	
	public static List<PostResponse> buildPost(List<Post> postes) {
		ArrayList<PostResponse> postsResponses = new ArrayList<PostResponse>();
		for (Post post : postes) {
			postsResponses.add(buildPost(post));
		}
		return postsResponses;
	}
	
	public static Post buildPost(PostRequest postRequest) {
		Post post = new Post();
		post.setDateCreation(postR);
		return post;
	}
}
