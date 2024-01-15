package com.cesam.cesam.web.data.organisation.humain.response.community;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;

public class CommunityMembers {

	private List<MemberResponse> communityMembers = new ArrayList<MemberResponse>();

	public CommunityMembers(List<MemberResponse> communityMembers) {
		super();
		this.communityMembers = communityMembers;
	}

	public List<MemberResponse> getCommunityMembers() {
		return communityMembers;
	}

	public void setCommunityMembers(List<MemberResponse> communityMembers) {
		this.communityMembers = communityMembers;
	}
	
}
