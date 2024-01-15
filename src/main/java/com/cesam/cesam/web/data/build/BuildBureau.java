package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.administration.Bureau;
import com.cesam.cesam.web.data.organisation.bureau.request.BureauRequest;
import com.cesam.cesam.web.data.organisation.bureau.response.BureauResponse;

public class BuildBureau {

	public static BureauResponse buildBureau(Bureau bureau) {
		BureauResponse bureauResponse = new BureauResponse();
		bureauResponse.setBureauId(bureau.getBureauId());
		bureauResponse.setMandatEnd(bureau.getMandatEnd());
		bureauResponse.setMandatStart(bureau.getMandatStart());
		bureauResponse.setMember(BuildMember.buildMember(bureau.getMember()));
		bureauResponse.setMots(bureau.getMots());
		bureauResponse.setCurrent(bureau.isCurrent());
		return bureauResponse;
	}
	
	public static List<BureauResponse> buildBureau(List<Bureau> bureaux) {
		ArrayList<BureauResponse> bureauxResponses = new ArrayList<BureauResponse>();
		for (Bureau bureau : bureaux) {
           bureauxResponses.add(buildBureau(bureau));
		}
		return bureauxResponses;
	}
	
	public static Bureau buildBureau(BureauRequest bureauRequest) {
		Bureau bureau = new Bureau();
		bureau.setMandatEnd(bureauRequest.getMandatEnd());
		bureau.setMandatStart(bureauRequest.getMandatStart());
		bureau.setMots(bureauRequest.getMots());
		return bureau;
	}
}
