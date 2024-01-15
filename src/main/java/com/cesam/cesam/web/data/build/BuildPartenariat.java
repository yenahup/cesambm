package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.relation.Partenariat;
import com.cesam.cesam.web.data.organisation.relation.request.PartenariatRequest;
import com.cesam.cesam.web.data.organisation.relation.response.PartenariatResponse;

public class BuildPartenariat {

	public static PartenariatResponse buildPartenariat(Partenariat partenariat) {
		PartenariatResponse partenariatResponse = new PartenariatResponse();
		partenariatResponse.setPartenariatId(partenariat.getPartenariatId());
		partenariatResponse.setPartenariatDate(partenariat.getPartenariatDate());
		partenariatResponse.setPartenariatName(partenariat.getPartenariatName());
		partenariatResponse.setPathToLogo(partenariat.getPathToLogo());
		
		return partenariatResponse;
	}
	
	public static List<PartenariatResponse> buildPartenariat(List<Partenariat> partenariats) {
		ArrayList<PartenariatResponse> partenariatsResponses = new ArrayList<PartenariatResponse>();
		for (Partenariat partenariat : partenariats) {
			partenariatsResponses.add(buildPartenariat(partenariat));
		}
		return partenariatsResponses;
	}
	
	public static Partenariat buildPartenariat(PartenariatRequest partenariatRequest) {
		Partenariat partenariat = new Partenariat();
		partenariat.setDescriptions(partenariatRequest.getDescriptions());
		partenariat.setPartenariatDate(partenariatRequest.getPartenariatDate());
		partenariat.setPartenariatName(partenariatRequest.getPartenariatName());
		partenariat.setPartenariatType(partenariatRequest.getPartenariatType());
		return partenariat;
	}
}
