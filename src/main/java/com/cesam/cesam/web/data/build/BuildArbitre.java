package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.sport.Arbitre;
import com.cesam.cesam.web.data.sport.arbitre.response.ArbitreResponse;

public class BuildArbitre {

	public static ArbitreResponse buildArbitre(Arbitre arbitre) {
		ArbitreResponse arbitreResponse = new ArbitreResponse();
		arbitreResponse.setArbitreId(arbitre.getArbitreId());
		arbitreResponse.setDescriptions(arbitre.getDescriptions());
		arbitreResponse.setMember(BuildMember.buildMember(arbitre.getMember()));
		return arbitreResponse;
	}
	
	public static List<ArbitreResponse> buildArbitre(List<Arbitre> arbitres) {
		ArrayList<ArbitreResponse> arbitreResponses = new ArrayList<ArbitreResponse>();
		for (Arbitre arbitre : arbitres) {
           arbitreResponses.add(buildArbitre(arbitre));
		}
		return arbitreResponses;
	}
	
	
}
