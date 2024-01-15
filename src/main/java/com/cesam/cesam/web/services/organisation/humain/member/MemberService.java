package com.cesam.cesam.web.services.organisation.humain.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesam.cesam.base.image.ImageProcessing;
import com.cesam.cesam.entity.organisation.humain.Member;
import com.cesam.cesam.entity.organisation.humain.repository.CommunityRepository;
import com.cesam.cesam.entity.organisation.humain.repository.MemberRepository;
import com.cesam.cesam.web.data.build.BuildMember;
import com.cesam.cesam.web.data.organisation.humain.request.member.MemberRequest;

@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepository;
	CommunityRepository communityRepository;
	private static final String folder = "/src/main/resources/static/Images/Profiles";
	
	public void addMember(MemberRequest memberRequest) {
		Member member = BuildMember.buildMember(memberRequest, communityRepository);
		String name = memberRequest.getFirstName()+ memberRequest.getLastName();
		ImageProcessing.saveImage(memberRequest.getFile(),folder , name);
		member.setPathToProfile(folder + name); 
		memberRepository.save(member);
	}
	public void updateMember(MemberRequest memberRequest, Long memberId) {
		Member member = BuildMember.buildMember(memberRequest, communityRepository);
		String name = memberRequest.getFirstName()+ memberRequest.getLastName();
		ImageProcessing.saveImage(memberRequest.getFile(),folder , name);
		member.setPathToProfile(folder + name); 
		member.setMemberId(memberId);
		memberRepository.save(member);
	}
	
	
	
}
