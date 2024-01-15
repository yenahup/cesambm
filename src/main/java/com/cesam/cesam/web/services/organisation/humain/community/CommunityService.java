package com.cesam.cesam.web.services.organisation.humain.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesam.cesam.base.image.ImageProcessing;
import com.cesam.cesam.entity.organisation.humain.Community;
import com.cesam.cesam.entity.organisation.humain.repository.CommunityRepository;
import com.cesam.cesam.entity.organisation.humain.repository.MemberRepository;
import com.cesam.cesam.web.data.build.BuildCommunity;
import com.cesam.cesam.web.data.organisation.humain.request.member.CommunityRequest;

@Service
public class CommunityService {

	@Autowired
	MemberRepository memberRepository;
	CommunityRepository communityRepository;
	private static final String folder = "/src/main/resources/static/Images/Community";
	
	public void addCommunity(CommunityRequest communityRequest) {
		Community community = BuildCommunity.buildCommunity(communityRequest);
		String name = communityRequest.getCommunityName();
		ImageProcessing.saveImage(communityRequest.getFile(),folder , name);
		community.setPathToLogo(folder + name);
		communityRepository.save(community);
	}
	public void updateCommunity(CommunityRequest communityRequest, Long communityId) {
		Community community = BuildCommunity.buildCommunity(communityRequest);
		String name = communityRequest.getCommunityName();
		ImageProcessing.saveImage(communityRequest.getFile(),folder , name);
		community.setPathToLogo(folder + name);
		community.setCommunityId(communityId);
	}
	
	
}
