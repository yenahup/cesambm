package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.informations.Laureat;
import com.cesam.cesam.web.data.organisation.humain.response.member.MemberResponse;
import com.cesam.cesam.web.data.organisation.informations.laureat.request.LaureatRequest;
import com.cesam.cesam.web.data.organisation.informations.laureat.response.LaureatResponse;

public class BuildLaureat {

	public static LaureatResponse buildLaureat(Laureat laureat) {
		LaureatResponse laureats = new LaureatResponse();
		MemberResponse member = BuildMember.buildMember(laureat.getMember());
		laureats = new LaureatResponse(laureat.getLaureat_id(),member,
				laureat.getDateLaureat(),laureat.getCycleLaureat(),
				laureat.getFilliereLaureat(), laureat.getSubjectLaureat());
		return laureats;
	}
	
	public static List<LaureatResponse> buildLaureat(List<Laureat> laureats) {
		List<LaureatResponse> laureatsResponses = new ArrayList<LaureatResponse>();
		for (Laureat laureat : laureats) {
			laureatsResponses.add(buildLaureat(laureat));
		}
		return laureatsResponses;
	}
	public static Laureat buildLaureat(LaureatRequest laureatRequest) {
		Laureat laureat = new Laureat();
		laureat.setCycleLaureat(laureatRequest.getCycleLaureat());
		laureat.setDateLaureat(laureatRequest.getDateLaureat());
		laureat.setFilliereLaureat(laureat.getFilliereLaureat());
		laureat.setSubjectLaureat(laureat.getSubjectLaureat());
		return laureat;
	}
}
