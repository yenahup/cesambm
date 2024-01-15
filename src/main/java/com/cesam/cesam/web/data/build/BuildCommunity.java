package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.humain.Community;
import com.cesam.cesam.web.data.organisation.humain.request.member.CommunityRequest;
import com.cesam.cesam.web.data.organisation.humain.response.community.CommunityResponse;

public class BuildCommunity {

	public static CommunityResponse buildCommunity(Community community) {
		CommunityResponse communityResponse = new CommunityResponse();
		communityResponse.setBelongDate(community.getBelongDate());
		communityResponse.setCommunityId(community.getCommunityId());
		communityResponse.setCommunityName(community.getCommunityName());
		communityResponse.setCountry(community.getCountry());
		communityResponse.setDescriptions(community.getDescriptions());
		communityResponse.setPathToLogo(community.getPathToLogo());
		return communityResponse;
	}
	
	public static List<CommunityResponse> buildCommunity(List<Community> communities) {
		ArrayList<CommunityResponse> communitiesResponses = new ArrayList<CommunityResponse>();
		for (Community community : communities) {
			communitiesResponses.add(buildCommunity(community));
		}
		return communitiesResponses;
	}
	
	public static Community buildCommunity(CommunityRequest communityRequest){
		Community community = new Community();
		community.setBelongData(communityRequest.getBelongDate());
		community.setCommunityName(communityRequest.getCommunityName());
		community.setCountry(communityRequest.getCountry());
		community.setDescriptions(communityRequest.getDescriptions());
		return community;
	}
}
