package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.humain.Community;
import com.cesam.cesam.entity.organisation.humain.Member;
import com.cesam.cesam.entity.organisation.humain.repository.CommunityRepository;
import com.cesam.cesam.web.data.organisation.humain.request.member.MemberRequest;
import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;

public class BuildMember {
	public static MemberResponse buildMember(Member member) {
		MemberResponse memberResponse = new MemberResponse();
		memberResponse.setCycle(member.getCycle());
		memberResponse.setDateInscription(member.getDateInscription());
		memberResponse.setDateNaissance(member.getDateNaissance());
		memberResponse.setDescription(member.getDescription());
		memberResponse.setEtablissement(member.getEtablissement());
		memberResponse.setFilliere(member.getFilliere());
		memberResponse.setFirstName(member.getFirstName());
		memberResponse.setLastName(member.getLastName());
		memberResponse.setMatricule(member.getMatricule());
		memberResponse.setMemberId(member.getMemberId());
		memberResponse.setPathToProfile(member.getPathToProfile());
		memberResponse.setUsername(member.getUsername());
		return memberResponse;
	}
	
	public static List<MemberResponse> buildMember(List<Member> members) {
		ArrayList<MemberResponse> memberResponses = new ArrayList<MemberResponse>();
		for (Member member : members) {
			memberResponses.add(buildMember(member));
		}
		return memberResponses;
	}
	
	public static Member buildMember(MemberRequest memberRequest, CommunityRepository communityRepository){
		Member member = new Member();
		Community memberCommunity = communityRepository.findById(memberRequest.getCommunityId()).get();
		member.setCommunity((Community)memberCommunity);
		member.setCycle(memberRequest.getCycle());
		member.setDateInscription(memberRequest.getDateInscription());
		member.setDateNaissance(memberRequest.getDateNaissance());
		member.setDescription(memberRequest.getDescription());
		member.setEtablissement(memberRequest.getEtablissement());
		member.setFirstName(memberRequest.getFirstName());
		member.setFilliere(memberRequest.getFilliere());
		member.setLastName(memberRequest.getLastName());
		member.setMatricule(memberRequest.getMatricule());
		member.setPassword(memberRequest.getPassword());
		member.setUsername(memberRequest.getUsername());
		return member;
	}
}
